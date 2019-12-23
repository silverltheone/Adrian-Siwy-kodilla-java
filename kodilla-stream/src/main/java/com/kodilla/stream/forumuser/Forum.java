package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Django", 'M', LocalDate.parse("1983-03-03"), 6));
        theUserList.add(new ForumUser(2, "Karo", 'M', LocalDate.parse("2002-05-05"), 3));
        theUserList.add(new ForumUser(3, "Muhak", 'M', LocalDate.parse("1995-12-05"), 0));
        theUserList.add(new ForumUser(4, "Parolla", 'F', LocalDate.parse("1988-02-16"), 5));
        theUserList.add(new ForumUser(5, "Invader", 'F', LocalDate.parse("2008-08-20"), 2));
        theUserList.add(new ForumUser(6, "Jockey", 'M', LocalDate.parse("2000-04-28"), 0));
        theUserList.add(new ForumUser(7, "Sharic", 'F', LocalDate.parse("1994-06-30"), 60));
        theUserList.add(new ForumUser(8, "Chica", 'F', LocalDate.parse("1999-09-09"), 0));
        theUserList.add(new ForumUser(9, "Koko", 'M', LocalDate.parse("1972-11-11"), 0));
        theUserList.add(new ForumUser(10, "Man", 'F', LocalDate.parse("1983-03-04"), 4));
    }

    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUserList);
    }



}
