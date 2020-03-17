package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Lord of the rings", "J.R.R Tolkien", LocalDate.of(1954, 01, 01));
        Book book2 = new Book("Witcher", "Sapkowski", LocalDate.of(1994, 01, 01));
        Library library = new Library("Fantasy Books");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(1,library.getBooks().size());
        Assert.assertEquals(1,clonedLibrary.getBooks().size());
        Assert.assertEquals(2,deepClonedLibrary.getBooks().size());
    }
}
