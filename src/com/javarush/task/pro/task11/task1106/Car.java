package com.javarush.task.pro.task11.task1106;

/* 
Одинаковые машины
*/

public class Car {
    // ТУТ с modelName убран static
    private String modelName;
    private int speed;

    // ТУТ убран static
    public String getModelName() {
        return modelName;
    }

    // ТУТ  отредактированин Car.modelName на this.modelName
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
