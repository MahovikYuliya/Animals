package com.company;

public  class Snake extends Animal {
    public Snake(int age, int weight, String color) {
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    @Override
    public String getName() {
        return "Snake";
    }
}