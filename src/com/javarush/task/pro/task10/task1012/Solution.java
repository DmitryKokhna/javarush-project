package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Solution {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
// ------------------МОЕ ИЗБЫТОЧНОЕ РЕШЕНИЕ ----------------------
        int counterNotNull = 0;
        int counterNull = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                counterNotNull++;
            } else {
                counterNull++;
            }
        }
        String[] arrayNotNull = new String[counterNotNull];
        int indexForNotNullArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arrayNotNull[indexForNotNullArray] = array[i];
                indexForNotNullArray++;
            }
        }

        String[] finalArray = new String[counterNotNull + counterNull];
        for (int i = 0; i < finalArray.length; i++) {
            if (i < counterNotNull) {
                finalArray[i] = arrayNotNull[i];
            } else {
                finalArray[i] = null;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = finalArray[i];

        }


    }
     // ---- КАК МОЖНО БЫЛО КРАТКО
//     public static void executeDefragmentation(String[] array) {
//         String[] temp = new String[array.length];
//         int j = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] != null) {
//                 temp[j] = array[i];
//                 j++;
//             }
//         }
//         for (int i = 0; i < array.length; i++) {
//             array[i] = temp[i];
//         }
//     }

}
