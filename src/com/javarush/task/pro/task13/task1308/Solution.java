package com.javarush.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {


//        Integer minimum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < minimum) {
//                minimum = list.get(i);
//            }
//        }
        // ТУТ ИСПОЛЬЗУЕТ класс Collection И метод MIN
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {

//        Integer maximum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > maximum) {
//                maximum = list.get(i);
//            }
//        }
        // ТУТ ИСПОЛЬЗУЕТ класс Collection И метод MAX
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
//        int frequency = 0;
//        if (element == null) {
//            return frequency;
//        } else {
//            for (Integer integer : list) {
//                if (element.equals(integer)) {
//                    frequency++;
//                }
//            }
//        }
        // ТУТ ИСПОЛЬЗУЕТ класс Collection И метод FREQUENCY
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
//        int low = 0;
//        int high = list.size() - 1;
//        int mid = (low + high) / 2;
//        int index = -1;
//        while (low <= high) {
//            if (list.get(mid) < key) {
//                low = mid + 1;
//            } else if (list.get(mid).equals(key)) {
//                index = mid;
//                break;
//            } else {
//                high = mid - 1;
//            }
//            mid = (low + high) / 2;
//        }
        // ТУТ сперва сортируем ИСПОЛЬЗУЯ класс Collection И метод SORT, затем BINARYsearch
        Collections.sort(list);
        return Collections.binarySearch(list, key);
    }
}
