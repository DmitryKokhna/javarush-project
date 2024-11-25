package com.javarush.task.pro.task04.task0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // обэявляем Ридер

        while (true) { // делаем бесконечный цикл
            String inputString = reader.readLine(); // выыитываем Ридер и ложим в переменную
            if (inputString.equals("enough")) { // проверяем что было введено
                break;  // если ввели ENOUGH прерываем цикл
            } else { // если НЕ ввели ENOUGH выводим что ввели
                System.out.println(inputString);
            }
        }
    }
}