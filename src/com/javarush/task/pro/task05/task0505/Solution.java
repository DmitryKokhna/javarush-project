package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = scanner.nextInt();
        int[] arrayOne = new int[enteredNumber];
        if (enteredNumber > 0) {
            arrayOne = new int[enteredNumber];

            //ТУТ заполняем массив
            for (int i = 0; i < arrayOne.length; i++) {
                arrayOne[i] = scanner.nextInt();
            }
//ТУТ МОЯ ПРОВЕРКА НА ПОРЯДОК ВЫВОДА
        }
        if (enteredNumber % 2 != 0) {
            for (int i = 0; i < arrayOne.length; i++) {
                System.out.println(arrayOne[i]);
            }
        } else {
            for (int i = arrayOne.length - 1; i >= 0; i--) {
                System.out.println(arrayOne[i]);
            }
        }
    }
}
