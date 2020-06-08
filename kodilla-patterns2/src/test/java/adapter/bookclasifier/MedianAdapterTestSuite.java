package adapter.bookclasifier;

import adapter.bookclasifier.librarya.Book;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> booksSet = new HashSet<>();
        booksSet.add(new Book("Tolkien", "Lord Of the Rings", 1962, "001"));
        booksSet.add(new Book("Sapkowski", "Witcher", 1991, "002"));
        booksSet.add(new Book("Ziemianski", "Achaja", 1998, "003"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(booksSet);
        //Then
        System.out.println(median);
        Assert.assertEquals(1991,median);
    }


}