package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w;
        multiArray = new int[h][];
        for (int i = 0; i < multiArray.length; i++) {
            w = scanner.nextInt();
            multiArray[i] = new int[w];
        }
    }
}

