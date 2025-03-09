package com.javarush.task.pro.task09.task0905;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21; //21
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25; //25
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int octNumber = 0;
        if (decimalNumber <= 0) {
            return octNumber;
        }
        int i = 0;
        while (decimalNumber != 0) {
            octNumber = (int) (octNumber + (decimalNumber % 8) * (Math.pow(10, i)));
            decimalNumber = decimalNumber / 8;
            i++;

        }
        return octNumber;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int decNumber = 0;
        if (octalNumber <= 0) {
            return decNumber;
        }
        int i = 0;
        while (octalNumber != 0) {
            decNumber = (int) (decNumber + (octalNumber % 10) * Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;

        }
        return decNumber;
    }
}


