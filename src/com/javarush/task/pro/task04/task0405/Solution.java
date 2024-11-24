package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int stringCount = 0;

        while (stringCount < 10) {
            int columnCount = 0;

            while (columnCount < 20) {
                if (stringCount == 0 || stringCount == 9) {
                    System.out.print("Б");
                } else if (columnCount == 0 || columnCount == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                columnCount++;
            }
            System.out.println();
            stringCount++;

        }

    }
}