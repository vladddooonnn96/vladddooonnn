package com.company.lesson8;

public class StudentDemo {
    public static void main(String[] args) {
        Student vlad = new Aspirant("Vlad", "Teslya", "558m", 5.33, "Telecommunication");
        Student vlad2 = new Student("Vlad", "Teslya", "558m", 5.33);
        Aspirant vlad3 = new Aspirant("Vlad", "Teslya", "558m", 5.0, "Freshline project");
        System.out.println(vlad.getFirstName() + " " + vlad.getLastName() + " " + vlad.getGroup() + " " + vlad.getAverageMark());
        System.out.println(vlad2.getFirstName() + " " + vlad2.getLastName() + " " + vlad2.getGroup() + " " + vlad2.getAverageMark());
        System.out.println(vlad3.getFirstName() + " " + vlad3.getLastName() + " " + vlad3.getGroup() + " " + vlad3.getAverageMark() + " " + vlad3.getScienceWork());
        Student[] studentik = {vlad, vlad2, vlad3};
        for (Student a : studentik) {
            double b = a.getScholarship();
            System.out.println(b);
        }
    }

}
