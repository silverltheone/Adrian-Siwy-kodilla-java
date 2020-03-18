package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User marek = new Millenials("Marek Zalewski");
        User jessica = new YGeneration("Jessica Piesik");
        User zuzia = new ZGeneration("Zuzanna Dzidkowska");

        //When
        String marekPost = marek.sharePost();
        System.out.println("Marek: " + marekPost);
        String jessicaPost = jessica.sharePost();
        System.out.println("Jesiica: " + jessicaPost);
        String zuziaPost = zuzia.sharePost();
        System.out.println("Zuzia: " + zuziaPost);

        //Then
        Assert.assertEquals("[Twitter] - post published", marekPost);
        Assert.assertEquals("[Facebook] - post published", jessicaPost);
        Assert.assertEquals("[Snapchat] - post published", zuziaPost);
}

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User marek = new Millenials("Marek Zalewski");

        //When
        String marekPost = marek.sharePost();
        System.out.println("Marek: " + marekPost);
        marek.setPostingStrategy(new SnapchatPublisher());
        marekPost = marek.sharePost();
        System.out.println("Marek: " + marekPost);

        //Then
        Assert.assertEquals("[Snapchat] - post published", marekPost);
    }
}
