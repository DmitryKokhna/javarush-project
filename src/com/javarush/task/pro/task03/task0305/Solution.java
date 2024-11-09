package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // 2 2 1
        if ((a == b) && (a == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if ((a == b) && (a != c) && (b != c)) {
            System.out.println(a + " " + b);
        } else if ((a == c) && (a != b) && (b != c)) {
            System.out.println(a + " " + c);
        } else if ((b == c) && (b != a) && (a != c)) {
            System.out.println(b + " " + c);
        }
    }
}

