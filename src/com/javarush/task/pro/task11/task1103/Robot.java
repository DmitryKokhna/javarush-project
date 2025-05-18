package com.javarush.task.pro.task11.task1103;

/* 
Презентация роботов
*/

public class Robot {

    public static int robotCounter;
    // ТУТ static убран т.к. ID уникальный для объекта
    public int id;
    // ТУТ static убран т.к. MODEL уникальный для объекта
    public String model;
    // ТУТ static убран т.к. ГОД уникальный для объекта
    public int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                id, robotCounter, model, vendor, productionYear);
    }
}
