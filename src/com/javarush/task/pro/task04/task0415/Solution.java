package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int square;
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        square = (int) (pi * (radius * radius));
        System.out.print(square);


    }
}