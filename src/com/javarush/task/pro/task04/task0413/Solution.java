package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int countString = 1; countString <= 10; countString++) { // тут делаем перевод строки после заполнения столбца

            for (int j = 1; j <= countString; j++) { // тут заполняем столбец.
                System.out.print("8");
            }
            System.out.println();
        }
    }
}