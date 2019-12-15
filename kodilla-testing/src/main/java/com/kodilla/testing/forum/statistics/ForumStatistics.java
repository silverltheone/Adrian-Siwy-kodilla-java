package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    double usersSum;
    double postsSum;
    double commentsSum;
    double postPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public void calculateAdvStatistics(Statistic statistic) {
        usersSum = statistic.userNames().size();

        postsSum = statistic.postsCount();

        commentsSum = statistic.commentsCount();

        if(statistic.userNames().size() != 0) {
            postPerUser = postsSum / usersSum;
        } else {
            postPerUser = 0;
        }

        if(statistic.userNames().size() != 0) {
            commentsPerUser = commentsSum / usersSum;
        } else {
            commentsPerUser = 0;
        }

        if(statistic.postsCount() != 0) {
            commentsPerPost = commentsSum / postsSum;
        } else {
            commentsPerPost = 0;
        }
    }

    public String showStatistics() {
        return "There are " + usersSum + " forum users//r They generated " + postsSum + " Posts//r and " + commentsSum + " comments //r This is equal to: " + postPerUser + "post per user //r and " + commentsPerUser + " comments per user //r and " + commentsPerPost + "comments pre post";
    }

    public double getUsersSum() {
        return usersSum;
    }

    public double getPostsSum() {
        return postsSum;
    }

    public double getCommentsSum() {
        return commentsSum;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
