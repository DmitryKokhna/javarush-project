package com.javarush.task.pro.task11.task1108;

/* 
Утильный калькулятор
*/

public class Solution {
    public static final String EQUAL = " = ";

    //ТУТ создаем внутренний класс Калькулятор и переносим все методы в него
    public static class Calculator {

        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }

    }

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        //ТУТ для вызова методов внетреннего класса, добавляем перед методом имя Внутренннего класса
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }


}
