package adapter.bookclasifier;

import adapter.bookclasifier.libraryb.Book;
import adapter.bookclasifier.libraryb.BookSignature;
import adapter.bookclasifier.libraryb.BookStatistic;
import adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
