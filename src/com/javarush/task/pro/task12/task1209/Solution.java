package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишите тут ваш код

//ТУТ в IF проверяем содержится ли передаваемое имя (name) в списке ожидаемых
        // ДОБАВЛЯЕМ имя в список получивших
        if (waitingEmployees.contains(name)) {
            // ДОБАВЛЯЕМ имя в список получивших
            alreadyGotSalaryEmployees.add(name);
            // МЕНЯЕМ в списке ожидаемых имя на NULL. для чего получаем индекс по имени
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}

