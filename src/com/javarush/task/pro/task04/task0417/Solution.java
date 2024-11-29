package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
Scanner scanner = new Scanner(System.in);
int speedMeterPerSecond = scanner.nextInt();
int speedKilometerPerHour = (int) Math.round(speedMeterPerSecond * 3.6);
System.out.print(speedKilometerPerHour);
    }
}