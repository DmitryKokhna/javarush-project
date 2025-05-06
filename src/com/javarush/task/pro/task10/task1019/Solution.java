package com.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Текущий год
*/

public class Solution {

    private int currentYear;
// ТУТ изначально было public void Solution(), что являлось сеттером.
    // убрав "void" - получаем конструктор с инициализацией поля при создании объекта
    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.getCurrentYear());
    }
}
