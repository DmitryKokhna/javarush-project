package com.javarush.task.pro.task08.task0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        //Мое дополение для проверки введенных элементов
        System.out.println(Arrays.toString(intArray));
        //Выводим минимальный элемент
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int minValue = ints[0];

        // Проходим по массиву и находим минимальное значение, используя только Math.min()
        for (int i = 1; i < ints.length; i++) {
            minValue = Math.min(minValue, ints[i]);
        }
        return minValue;
    }

    public static int[] getArrayOfTenElements() {
        int array[] = new int[10];

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //напишите тут ваш код
        return array;
    }
}
