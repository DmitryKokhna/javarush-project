package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean stateOfBrain = scanner.nextBoolean();

        if (stateOfBrain) {
            System.out.print((int)Math.ceil(glass)); // избавляемся от дробной части, используя приведение к INT
        } else {

            System.out.print((int)Math.floor(glass)); // избавляемся от дробной части, используя приведение к INT
        }


    }
}