package com.javarush.task.pro.task12.task1208;

/* 
Сравнение символов
*/

public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('ы', 'ы');

    }

    public static void compare(Character first, Character second) {
        //ТУТ вместо (first == second) используем (first.equals(second)) Т.К. сравнение символов идет по UNICODE
        // и до 128 идет кэширование,  и эти числа не ссылочные т.о. можно сравнивать через "=="
        // после 128 будет тололько ссылочное сравнение. И чтобы сравнить значения,
        // нужно использовать "equals"
        if (first.equals(second)) {
            System.out.println("равны");

        } else if (first > second) {
            System.out.println("больше");

        } else if (first < second) {
            System.out.println("меньше");

        } else {
            System.out.println("А как такое может быть???");
        }
    }
}

