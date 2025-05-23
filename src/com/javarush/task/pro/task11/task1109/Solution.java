package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
// ТУТ создаем объект для Вложенного (nested) класса
        Outer.Nested nested = new Outer.Nested();

        // ТУТ для внутреннего класса спрева создаем объект для Родительского (Внешнего) класса
        // а на основе обекта Внешнего класса создаем объект веутреннего класса
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
