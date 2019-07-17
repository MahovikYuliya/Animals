package com.company;

public class Bird extends Animal {
    public Bird(int age, int weight, String color) {
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    @Override
    public String getName() {
        return "Bird{}";
    }


    }
