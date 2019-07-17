package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(3, 15, "Black");
        Cat cat = new Cat(5, 25, "White");
        Bird bird = new Bird(1, 1, "Yellow");
        Snake snake = new Snake(76, 25, "Green");
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(bird.toString());
        System.out.println(snake.toString());

    }
}
