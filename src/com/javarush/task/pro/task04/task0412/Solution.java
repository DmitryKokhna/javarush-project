package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сумма кратных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //напишите тут ваш код
        // сперва через WHILL
        //    while (start <end){
        //       sum= sum +start;
        //        start++;
        //     }
        for (; start < end; start++) {
            if ((start % multiple) != 0) {
                continue;
            } else {
                sum = sum + start;
            }

        }
        System.out.println(sum);
    }

}
