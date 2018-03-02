package com.company.lesson7.Library;


public class Reader {
    private String fullName, ticketNumber, birthDay, faculty;
    private int phoneNumber;


    public Reader(String fullName, String ticketNumber, String birthDay, String faculty, int phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.birthDay = birthDay;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int num) {
        System.out.println(fullName + " взял " + num + " книги!");
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book a : books) {
            System.out.print(a.getAuthorName() + ", " + a.getBookTitle() + " ,");
        }
        System.out.println();
    }

    public void takeBook(String... names) {
        System.out.print(fullName + " взял книги: ");
        for (String a : names) {
            System.out.print(a);
        }
        System.out.println();
    }

    public void returnBook(int num) {
        System.out.println(fullName + " вернул " + num + " книги!");
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book a : books) {
            System.out.print(a.getAuthorName() + ", " + a.getBookTitle() + " ,");
        }
        System.out.println();
    }

    public void returnBook(String... names) {
        System.out.print(fullName + " вернул книги: ");
        for (String a : names) {
            System.out.print(a);
        }
        System.out.println();
    }
}