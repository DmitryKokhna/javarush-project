package com.javarush.task.pro.task11.task1102;

/* 
Земля: техническая характеристика
*/

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        // ТУТ ранеее значения присваивались как ститичным переменным класса, например,
        // Pnanet.name.
        // Теперь - присваивается как переменной объекта.
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
