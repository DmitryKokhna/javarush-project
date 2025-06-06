package com.javarush.task.pro.task09.task0918;

/* 
Поработаем со StringBuilder
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(string);
        // тут перебираем массив со словами и добавляем из по одному
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.replace(start, end, str);
        return stringBuilder;
    }
}
