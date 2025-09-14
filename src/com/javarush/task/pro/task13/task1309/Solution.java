package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        // ТУТ ЗАПОЛНЯЕМ испольязуя метод PUT
        Double rate = 0.0;
        String name = Integer.toString(rate.intValue());
        for (int i = 0; i < 5; i++) {
            grades.put(name, rate);
            rate++;
            name = Integer.toString(rate.intValue());
        }
    }
}
