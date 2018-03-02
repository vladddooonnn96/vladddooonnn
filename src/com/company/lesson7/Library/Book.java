package com.company.lesson7.Library;

public class Book {
    private String authorName, bookTitle;

    public Book(String authorName, String bookTitle) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}