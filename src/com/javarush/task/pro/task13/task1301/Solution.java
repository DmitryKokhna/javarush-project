package com.javarush.task.pro.task13.task1301;

import java.util.Collections;
import java.util.HashSet;

/* 
Оформляем возврат
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        //ТУТ объявляем новый HashSet
        HashSet<String> returnHashSet = new HashSet<String>();
        // тут перебираем передаваемый в метод массив и элементы массива добавдяем в HashSet
        for(String s : strings){
returnHashSet.add(s);
        }
        return returnHashSet;
    }
}
