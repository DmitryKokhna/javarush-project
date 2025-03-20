package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код

        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        // тут определяем сколько будет подстрок, т.е. ячеек в массиве
        int a = stringTokenizer.countTokens();
        // задаем массив строковый с размерность под кол-во подстрок
        String[] token2 = new String[a];
        //заполняем массив
        for (int i = 0; i < a; i++) {
            token2[i] = stringTokenizer.nextToken();
        }

        return token2;
    }
}
