package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        int a,b,c;
        Scanner scannerInt = new Scanner(System.in);
        a = scannerInt.nextInt();
        b = scannerInt.nextInt();
        c = scannerInt.nextInt();
        System.out.println((a+b+c)/3);


    }
}
