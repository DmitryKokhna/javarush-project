package com.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Найти и обезвредить
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишите тут ваш код
        //ТУТ объявляем переменную для сравнения
                String s;
                //циклом проходим по Списку и переводим в нижний регистр
        // если элемент найден, то удаяем его
        // сдвигаем Индекс на минус 1, т.к. список стал меньше
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i).toLowerCase();
            if (s.equals("bug")) {
                list.remove(i);
                i--;
            }
        }

    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишите тут ваш код
        //ТУТ через Итератор перебираем Список
        Iterator<String> it = list.iterator();
        // через цикл проверяем есть ли элементы в Списке
        // ложим элемент в Список
        // переводми в нижний регистр
        // сравниваем по значению и удаляем по значению
        while (it.hasNext()) {
            String str = it.next();
            String strLowerCase = str.toLowerCase();
            if (strLowerCase.equals("bug"))
                it.remove();
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишите тут ваш код
        //ТУТ создаем копию списка
        ArrayList<String> copyList = new ArrayList<>(list);
         //объявляем перменную под нижний регистр
        String lowerCase;
          //Перебираем Список
        //  элемент переводим в нижний регистр
        // удаляем по значению
        for (String string : copyList) {
            lowerCase = string.toLowerCase();
            if (lowerCase.equals("bug")) {
                list.remove(string);

            }


        }
    }
}
