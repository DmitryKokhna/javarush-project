package com.javarush.task.pro.task02.task0210;

/* 
С каждым разом огромнее
*/

public class Solution {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";
// Using "Integer.parseInt(String)" twice for both String variables and Summarize their,
        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount); //напишите тут ваш код

        System.out.println(hugeAmount);
    }
}
