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
            for (int i = 0; i < enteredNumber; i++) {
                arrayOne[i] = scanner.nextInt();
            }
//ТУТ МОЯ ПРОВЕРКА НА ПОРЯДОК ВЫВОДА !!!!!!!!!!!!!!!!!!!! НАПИСАТЬ
        }
        for (int i = 0; i < enteredNumber; i++) {
            System.out.println(arrayOne[i]);
        }
    }
}
