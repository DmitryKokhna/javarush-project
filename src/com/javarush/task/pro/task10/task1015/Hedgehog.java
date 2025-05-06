package com.javarush.task.pro.task10.task1015;

/* 
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        // ТУТ создаем объект ЯБЛОКО
        Apple apple = new Apple();
        // ТУТ создаем объект ЕЖИК
        Hedgehog hedgehog = new Hedgehog();
        //ТУТ ЕЖИК испильзует метод EAT в который передается объект ЯБЛОКО
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
