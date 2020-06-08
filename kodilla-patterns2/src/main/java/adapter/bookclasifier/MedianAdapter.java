package adapter.bookclasifier;

import adapter.bookclasifier.librarya.Book;
import adapter.bookclasifier.librarya.Classifier;
import adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, adapter.bookclasifier.libraryb.Book> booksMap = new HashMap<>();
        for(Book book : bookSet) {
            booksMap.put(new BookSignature(book.getSignature()), new adapter.bookclasifier.libraryb.Book(book.getAuthor(),book.getTitle(),book.getPublicationYear()));
        }
        return medianPublicationYear(booksMap);
    }
}
