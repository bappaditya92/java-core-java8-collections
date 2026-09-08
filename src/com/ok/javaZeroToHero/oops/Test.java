package com.ok.javaZeroToHero.oops;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Black";
        car.brand = "Skoda";
        car.model = "Kylaq";
        car.year = 2026;

        car.accelarate(11);
        System.out.println(car.speed);
    }
}
