package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 0;
        int amount = 0; // объявляем сумму для чилел
        while (a < 100) {  // цикл работает до НЕ строго 100 т.к. в цикле сразу увеличиваем счетчик
            a++;
            if (a % 3 == 0) { // проверка на кратность 3-м
                continue; // пропускаем если кратно 3-м
            } else {
                amount = amount + a; // суммирует все что НЕ кратно 3-м
            }
        }
        System.out.println(amount);
    }
}