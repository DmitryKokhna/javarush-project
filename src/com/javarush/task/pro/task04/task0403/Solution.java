package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        boolean stopWordState = false;
        String stopWord;

        while (!stopWordState) {
            if (scanner.hasNextInt()) {
                counter = counter + scanner.nextInt();
            } else {
                stopWord = scanner.nextLine();
                stopWordState = stopWord.equals("ENTER");
            }
        }
        System.out.println(counter);
    }

}
