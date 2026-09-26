package com.ok.javaZeroToHero.constructor;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Bappaditya", 20, 123);
//        student.setAge(20);
//        System.out.println(student.getAge());
        //System.out.println(student.getAge());
        System.out.println(student.name);
        System.out.println(student.getAge());
        System.out.println(student.getRollNo());

    }
}
