package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toUpperCase();
        String string3 = scanner.nextLine();
        // gg
        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);


    }
}
