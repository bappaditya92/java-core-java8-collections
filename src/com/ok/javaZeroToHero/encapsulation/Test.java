package com.ok.javaZeroToHero.encapsulation;

public class Test {
    public static void main(String[] args) {
    Student student = new Student();

    student.name = "Bappaditya";
    student.setAge(15);
    student.rollNo = 1;
        System.out.println(student.name);
        System.out.println(student.getAge());


    }
}
