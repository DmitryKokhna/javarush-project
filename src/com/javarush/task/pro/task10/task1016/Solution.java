package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код
        // ТУТ формируем строку с обращением к ГЕТТРЕРАМ
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        // ТУТ создаем объект и передаем параметры
        City cityMinsk = new City("Minsk", 10);
        //ТУТ вызываем метод с Созданным объектом
        showWeather(cityMinsk);
    }
}
