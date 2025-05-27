package com.javarush.task.pro.task12.task1204;

/* 
Плата по счетам
*/

public class Solution {
    //ТУТ добавили инициализацию переменной значением Integer.MAX_VALUE;
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        //напишите тут ваш код
        //ТУТ парсим переменную BILL
        int billToInt = Integer.parseInt(bill);
        //ТУТ получаем итоговое знаение для BALANCE
        balance= balance-billToInt;
    }
}
