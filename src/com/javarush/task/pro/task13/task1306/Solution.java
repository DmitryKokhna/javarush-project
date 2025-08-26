package com.javarush.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 1
*/

public class Solution {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        // ТУТ используем метод "copy" класса Collections
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
// ТУТ используем метод "addAll" класса Collections
        Collections.addAll(list,strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        // ТУТ используем метод "replaceAll" класса Collections
        Collections.replaceAll(list,oldValue,newValue);

    }
}
