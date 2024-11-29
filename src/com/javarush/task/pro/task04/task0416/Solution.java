package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int canAtBox = scanner.nextInt();
        int person = scanner.nextInt();

        double canPerPerson;
        // умножаем на "1.0" чтобы конвертировать первую переменную в DOUBLE
        canPerPerson = 1.0 * canAtBox / person; // избыточная, но для наглядности

        System.out.print(canPerPerson);


    }
}