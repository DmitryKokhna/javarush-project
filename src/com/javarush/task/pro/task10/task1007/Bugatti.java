package com.javarush.task.pro.task10.task1007;

/* 
С крышей или без? Вот в чем вопрос
*/

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    //напишите тут ваш код
   // ТУТ определяем ГЕТТЕР для переменной BODY
    public String getBody() {
        return body;
    }
    // ТУТ определяем CЕТТЕР для переменной BODY
    public void setBody(String body) {
        this.body = body;
    }
}
