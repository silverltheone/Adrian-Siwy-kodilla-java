package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Zakupy");
        board.getInProgressList().getTasks().add("Pranie");
        board.getDoneList().getTasks().add("Sprzątanie");
        //Then
        System.out.println("To Do List:");
        board.getToDoList().getTasks().stream()
                .forEach(System.out::println);

        System.out.println("In progress List:");
        board.getInProgressList().getTasks().stream()
                .forEach(System.out::println);

        System.out.println("Done List");
        board.getDoneList().getTasks().stream()
                .forEach(System.out::println);
    }

}
