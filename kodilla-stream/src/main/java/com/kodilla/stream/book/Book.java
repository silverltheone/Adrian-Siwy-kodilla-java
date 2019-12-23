package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPubliocation;
    private final String signature;

    public Book(String author, String title, int yearOfPubliocation, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPubliocation = yearOfPubliocation;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPubliocation() {
        return yearOfPubliocation;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPubliocation=" + yearOfPubliocation +
                ", signature='" + signature + '\'' +
                '}';
    }
}
