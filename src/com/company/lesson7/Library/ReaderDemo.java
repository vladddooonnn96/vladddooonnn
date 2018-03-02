package com.company.lesson7.Library;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Vlad", "25", "09.08.1996", "5", 786746465);
        Reader reader2 = new Reader("Alexey", "33", "06.07.1989", "5", 7853963);
        Book book1 = new Book("Б.Акунин", "Алмазная колесница");
        Book book2 = new Book("А.Нотомб", "Гигиена убийцы");
        Book book3 = new Book("М.Булгаков", "Мастер и Маргарита");
        Book book4 = new Book("К.Льюис", "Хроники Нарнии");
        reader1.takeBook(4);
        reader1.takeBook(book1, book2, book3, book4);
        reader1.takeBook("Хроники Нарнии");
        reader2.returnBook(6);
        reader2.returnBook(book3, book4);
        reader2.returnBook("Мастер и Маргарита");


    }
}
