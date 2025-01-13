package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        /*
        // Мои дополнения
        Scanner scanner = new Scanner(System.in);
        int entered = scanner.nextInt();
        long a = cube(entered);
        System.out.println(a);
        */
    }

    //напишите тут ваш код
    public static long cube(long numberToCalculate) {
        long result;
        result = (long) Math.pow(numberToCalculate, 3);
        return result;
    }

}
