package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        int firstArrayLength = firstArray.length, secondArrayLength = secondArray.length,
                resultArrayLength = firstArrayLength + secondArrayLength;
        resultArray = new int[resultArrayLength];

        for (int i = 0; i < firstArrayLength; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int j = 0; j < secondArrayLength; j++) {
            resultArray[firstArrayLength + j] = secondArray[j];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
