package com.company;


public  class Cat extends Animal{
    public Cat(int age , int weight,String color ) {
        setAge(age);
        setWeight(weight);
        setColor(color);

    }
    @Override
    public String getName() {
        return "Cat";
    }

    }

