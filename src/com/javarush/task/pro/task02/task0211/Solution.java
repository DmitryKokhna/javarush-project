package com.javarush.task.pro.task02.task0211;

/* 
Получение длины строки
*/

public class Solution {

    public static void main(String[] args) {
        String emptyString = "";

        //напишите тут ваш код
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length()); // Вот так ,ответ не принимается System.out.println(("Gomu Gomu no Bazooka!").length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
