package com.javarush.task.pro.task02.task0205;

/* 
Когда-то было 32 зуба
*/

public class Solution {

    public static void main(String[] args) {
        int toothCounter = 32;

        //напишите тут ваш код
        /* Мое решение 1. Но не проходит повторому условию.
        *
        * toothCounter--;
        * toothCounter--;
        * while (toothCounter >= 24) {
        * toothCounter--;
        *
        * Мое решение 2. Максимально кратко. Но не будет соответвовать требованию из-за
        * необходимости несколько раз использовать "декремент".
        *
        * toothCounter -= 9;
        *
        */
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;

        System.out.println(toothCounter);
    }
}
