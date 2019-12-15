package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of the tests.");
    }

    @AfterClass
    public static void aterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        //When
        forumUser.addPost("mrSmith", "Hi im new here");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone" + "im new here", "mrSmith");
        //When
        forumUser.addComment(thePost, "mrSmith", "Thank you all");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hi im new here", "mrSmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hi im new here", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you", "mrSmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemmovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hi im new here", "mrSmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hi im new here", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "Thanky yoy", "mrSmith");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //When
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hi im new here", "mrSmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //When
        ForumUser forumUser = new ForumUser("mrSmith", "Joh Smith");
        ForumPost thePost = new ForumPost("Hi im new here", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you", "mrSmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}

