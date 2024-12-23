package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        if ((sideA < (sideB + sideC)) && (sideB < (sideA+sideC)) && (sideC < (sideA+sideB)))
        {
            System.out.println(TRIANGLE_EXISTS);
        }
        else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
