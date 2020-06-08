package com.kodilla.patterns2.observer.homework;


import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue adrianTaskQueue = new TaskQueue("Adrian Siwy tasks");
        TaskQueue zbigniewTaskQueue = new TaskQueue("Zbigniew Kowalski tasks");
        TaskQueue karolinaTaskQueue = new TaskQueue("Karolina Nowak tasks");
        TaskQueue marcinTaskQueue = new TaskQueue("Marcin Mierzwa tasks");

        Mentor andrzejMentor = new Mentor("Andrzej Jaromin");
        Mentor marcinMentor = new Mentor("Marcin Szuppe");

        adrianTaskQueue.registerObserver(andrzejMentor);
        zbigniewTaskQueue.registerObserver(andrzejMentor);
        karolinaTaskQueue.registerObserver(andrzejMentor);
        marcinTaskQueue.registerObserver(marcinMentor);

        //When
        adrianTaskQueue.addTask("Task 19");
        adrianTaskQueue.addTask("Task 20");
        adrianTaskQueue.addTask("Task 21");
        zbigniewTaskQueue.addTask("Task 21");
        karolinaTaskQueue.addTask("Task 21");
        marcinTaskQueue.addTask("Task21");

        //Then
        Assert.assertEquals(5, andrzejMentor.getUpdateCount());
        Assert.assertEquals(1, marcinMentor.getUpdateCount());
    }
}