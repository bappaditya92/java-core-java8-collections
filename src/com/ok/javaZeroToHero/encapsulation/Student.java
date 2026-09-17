package com.ok.javaZeroToHero.encapsulation;

public class Student {
    //properties/ fields / instance variable & behavior
    String name;


    int rollNo;

    private int age;
    public void setAge(int age){
        if(age<0){
            age = 0;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
