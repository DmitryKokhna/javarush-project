package com.javarush.task.pro.task12.task1222;

import java.util.ArrayList;

/* 
Выводим в консоли разные типы
*/

public class Solution {
// ТУТ исправили  ArrayList<String> на ArrayList
    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");
//ТУТ пропала ошибка по "arrayList"
        printAnything(arrayList);
    }
}
