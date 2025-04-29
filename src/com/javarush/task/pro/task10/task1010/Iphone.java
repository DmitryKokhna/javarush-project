package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишите тут ваш код
    public boolean equals(Object obj) {
        //ТУТ проверяем, если мы передадим этот же объект
        if (this == obj)
            return true;
        // ТУТ проверяем, если мы ничего не передадим для сравнения
        if (obj == null)
            return false;
        //ТУТ проверяем, если объект вообще относится к классу
        if (!(obj instanceof Iphone))
            return false;
        // ТУТ делаем приведение типа переданного объекта и повещаем его в переменную
        Iphone iphone = (Iphone) obj;
        //ТУТ сравниваем ВСЕ переменные имеющиеся у объектов через AND
        return this.price == iphone.price && this.model == iphone.model && this.color == iphone.color;

    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
