package com.javarush.task.pro.task03.task0312;

import java.security.Signature;
import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String stringOne = new Scanner(System.in).nextLine();
        String stringTwo = new Scanner(System.in).nextLine();
        if (stringOne.equals(stringTwo)) {
            System.out.println("строки одинаковые");
        }
        //напишите тут ваш код
        else {
            System.out.println("строки разные");
        }
    }
}