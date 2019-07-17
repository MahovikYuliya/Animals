package com.company;

public  class Dog extends Animal {
    public Dog(int age, int weight, String color) {
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    @Override
    public String getName() {
        return "Dog";
    }
}