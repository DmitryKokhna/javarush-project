package com.javarush.task.pro.task09.task0910;

/* 
Кодировка Unicode
*/

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        //напишите тут ваш код
        for (int i = 0; i < symbols.length; i++) {
            if (i == 0) {
                symbols[i] = '\u00A9';
            } else if (i == 1) {
                symbols[i] = '\u004A';
            } else if (i == 2) {
                symbols[i] = '\u0061';
            } else if (i == 3) {
                symbols[i] = '\u0076';
            } else if (i == 4) {
                symbols[i] = '\u0061';
            } else if (i == 5) {
                symbols[i] = '\u0052';
            } else if (i == 6) {
                symbols[i] = '\u0075';
            } else if (i == 7) {
                symbols[i] = '\u0073';
            } else {
                symbols[i] = '\u0068';
            }
        }
    }
}
