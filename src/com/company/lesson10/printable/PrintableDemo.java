package com.company.lesson10.printable;

import com.company.lesson10.printable.Book;
import com.company.lesson10.printable.Magazine;
import com.company.lesson10.printable.Printable;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Властелин колец");
        Book book2 = new Book("Властелин колец");
        Magazine magazine1 = new Magazine("Maxim");
        Magazine magazine2 = new Magazine("Ухтышка");
        Printable[] printable = {book1, book2, magazine1, magazine2};
        for (Printable p : printable) {
            p.print();
        }
    }
}