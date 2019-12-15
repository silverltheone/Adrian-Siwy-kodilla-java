package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsPostNumber0() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> namesList = new ArrayList<String>();
        namesList.add("1");
        namesList.add("2");
        namesList.add("3");
        namesList.add("4");
        namesList.add("5");
        namesList.add("6");
        namesList.add("7");
        namesList.add("8");

        when(statisticMock.userNames()).thenReturn(namesList);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.postsCount()).thenReturn(0);

        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double checkUsersSum = forumStatistics.getUsersSum();
        double checkPostsSum = forumStatistics.getPostsSum();
        double checkCommentsSum = forumStatistics.getCommentsSum();
        double checkPostPerUser = forumStatistics.getPostPerUser();
        double checkCommentsPerUser = forumStatistics.getCommentsPerUser();
        double checkCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(8, checkUsersSum, 0.001);
        Assert.assertEquals(0, checkPostsSum, 0.001);
        Assert.assertEquals(10, checkCommentsSum, 0.001);
        Assert.assertEquals(0, checkPostPerUser, 0.001);
        Assert.assertEquals(1.25, checkCommentsPerUser, 0.001);
        Assert.assertEquals(0, checkCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsPostNumber1000() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> namesList = new ArrayList<String>();
        namesList.add("1");
        namesList.add("2");
        namesList.add("3");
        namesList.add("4");
        namesList.add("5");
        namesList.add("6");
        namesList.add("7");
        namesList.add("8");

        when(statisticMock.userNames()).thenReturn(namesList);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.postsCount()).thenReturn(1000);

        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double checkUsersSum = forumStatistics.getUsersSum();
        double checkPostsSum = forumStatistics.getPostsSum();
        double checkCommentsSum = forumStatistics.getCommentsSum();
        double checkPostPerUser = forumStatistics.getPostPerUser();
        double checkCommentsPerUser = forumStatistics.getCommentsPerUser();
        double checkCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(8, checkUsersSum, 0.001);
        Assert.assertEquals(1000, checkPostsSum, 0.001);
        Assert.assertEquals(10, checkCommentsSum, 0.001);
        Assert.assertEquals(125, checkPostPerUser, 0.001);
        Assert.assertEquals(1.25, checkCommentsPerUser, 0.001);
        Assert.assertEquals(0.01, checkCommentsPerPost, 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsCommentsNumber0() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> namesList = new ArrayList<String>();
        namesList.add("1");
        namesList.add("2");
        namesList.add("3");
        namesList.add("4");
        namesList.add("5");
        namesList.add("6");
        namesList.add("7");
        namesList.add("8");

        when(statisticMock.userNames()).thenReturn(namesList);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postsCount()).thenReturn(10);

        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double checkUsersSum = forumStatistics.getUsersSum();
        double checkPostsSum = forumStatistics.getPostsSum();
        double checkCommentsSum = forumStatistics.getCommentsSum();
        double checkPostPerUser = forumStatistics.getPostPerUser();
        double checkCommentsPerUser = forumStatistics.getCommentsPerUser();
        double checkCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(8, checkUsersSum, 0.001);
        Assert.assertEquals(10, checkPostsSum, 0.001);
        Assert.assertEquals(0, checkCommentsSum, 0.001);
        Assert.assertEquals(1.25, checkPostPerUser, 0.001);
        Assert.assertEquals(0, checkCommentsPerUser, 0.001);
        Assert.assertEquals(0, checkCommentsPerPost, 0.001);
    }
@Test
    public void testCalculateAdvStatisticsPostsGreaterThenComments() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> namesList = new ArrayList<String>();
        namesList.add("1");
        namesList.add("2");
        namesList.add("3");
        namesList.add("4");
        namesList.add("5");
        namesList.add("6");
        namesList.add("7");
        namesList.add("8");

        when(statisticMock.userNames()).thenReturn(namesList);
        when(statisticMock.commentsCount()).thenReturn(5);
        when(statisticMock.postsCount()).thenReturn(10);

        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double checkUsersSum = forumStatistics.getUsersSum();
        double checkPostsSum = forumStatistics.getPostsSum();
        double checkCommentsSum = forumStatistics.getCommentsSum();
        double checkPostPerUser = forumStatistics.getPostPerUser();
        double checkCommentsPerUser = forumStatistics.getCommentsPerUser();
        double checkCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(8, checkUsersSum, 0.001);
        Assert.assertEquals(10, checkPostsSum, 0.001);
        Assert.assertEquals(5, checkCommentsSum, 0.001);
        Assert.assertEquals(1.25, checkPostPerUser, 0.001);
        Assert.assertEquals(0.625, checkCommentsPerUser, 0.001);
        Assert.assertEquals(0.5, checkCommentsPerPost, 0.001);
    }
@Test
    public void testCalculateAdvStatisticsCommentsGreaterThenPosts() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> namesList = new ArrayList<String>();
        namesList.add("1");
        namesList.add("2");
        namesList.add("3");
        namesList.add("4");
        namesList.add("5");
        namesList.add("6");
        namesList.add("7");
        namesList.add("8");

        when(statisticMock.userNames()).thenReturn(namesList);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.postsCount()).thenReturn(5);

        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double checkUsersSum = forumStatistics.getUsersSum();
        double checkPostsSum = forumStatistics.getPostsSum();
        double checkCommentsSum = forumStatistics.getCommentsSum();
        double checkPostPerUser = forumStatistics.getPostPerUser();
        double checkCommentsPerUser = forumStatistics.getCommentsPerUser();
        double checkCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(8, checkUsersSum, 0.001);
        Assert.assertEquals(5, checkPostsSum, 0.001);
        Assert.assertEquals(10, checkCommentsSum, 0.001);
        Assert.assertEquals(0.625, checkPostPerUser, 0.001);
        Assert.assertEquals(1.25, checkCommentsPerUser, 0.001);
        Assert.assertEquals(2, checkCommentsPerPost, 0.001);
    }
@Test
    public void testCalculateAdvStatisticsUsersNumber0() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> namesList = new ArrayList<String>();

        when(statisticMock.userNames()).thenReturn(namesList);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.postsCount()).thenReturn(5);

        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double checkUsersSum = forumStatistics.getUsersSum();
        double checkPostsSum = forumStatistics.getPostsSum();
        double checkCommentsSum = forumStatistics.getCommentsSum();
        double checkPostPerUser = forumStatistics.getPostPerUser();
        double checkCommentsPerUser = forumStatistics.getCommentsPerUser();
        double checkCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(0, checkUsersSum, 0.001);
        Assert.assertEquals(5, checkPostsSum, 0.001);
        Assert.assertEquals(10, checkCommentsSum, 0.001);
        Assert.assertEquals(0, checkPostPerUser, 0.001);
        Assert.assertEquals(0, checkCommentsPerUser, 0.001);
        Assert.assertEquals(2, checkCommentsPerPost, 0.001);
    }
@Test
    public void testCalculateAdvStatisticsUsersNumber100() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> namesList = new ArrayList<String>();
        for(int n=0; n<100; n++) {
            namesList.add("User " + n);
        }

        when(statisticMock.userNames()).thenReturn(namesList);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.postsCount()).thenReturn(5);

        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double checkUsersSum = forumStatistics.getUsersSum();
        double checkPostsSum = forumStatistics.getPostsSum();
        double checkCommentsSum = forumStatistics.getCommentsSum();
        double checkPostPerUser = forumStatistics.getPostPerUser();
        double checkCommentsPerUser = forumStatistics.getCommentsPerUser();
        double checkCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(100, checkUsersSum, 0.001);
        Assert.assertEquals(5, checkPostsSum, 0.001);
        Assert.assertEquals(10, checkCommentsSum, 0.001);
        Assert.assertEquals(0.05, checkPostPerUser, 0.001);
        Assert.assertEquals(0.1, checkCommentsPerUser, 0.001);
        Assert.assertEquals(2, checkCommentsPerPost, 0.001);
    }
}
