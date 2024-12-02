package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        array = new int[n];
        int maxValue;

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());// ЗАЧЕМ-то проверяем?
        }
        maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }
}
