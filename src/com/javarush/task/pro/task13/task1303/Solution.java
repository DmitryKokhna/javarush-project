package com.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Выводим в консоли элементы множества
*/

public class Solution {

    public static void print(HashSet<String> words) {
        //напишите тут ваш код
        //ТУТ обхявляем Итератор
        Iterator<String> iterator = words.iterator();
        //ТУТ в While проверяем наличие элемента в SET и если он есть, то ложим его в переменную типа String и выводим ее
        while (iterator.hasNext()){
            String word = iterator.next();
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
