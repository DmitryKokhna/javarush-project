package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int firstMinimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int enteredDigit = scanner.nextInt();
            if (enteredDigit < firstMinimum) {

                /*
                сдвигаем первое знание на уровень второго. чтобы далее сравнимать нес Integer.MAX_VALUE, a c second b first
                Напимер, было FIRST==10, а SECOND ==11. Затем ввели "9". Так SECOND 10, FIRST станет 9.
                 */
                secondMinimum = firstMinimum;

                firstMinimum = enteredDigit;
            } else if (enteredDigit > firstMinimum && enteredDigit < secondMinimum) {
                secondMinimum = enteredDigit;
            }
        }
        System.out.println(secondMinimum);
    }
}
/*


  int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int tmp = console.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp > min && tmp < secondMin) {
                secondMin = tmp;
            }
        }

        System.out.println(secondMin);
 */