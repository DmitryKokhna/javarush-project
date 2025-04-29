package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    //напишите тут ваш код
    //ТУТ объявляем ГЕТТЕР для переменной SALARY
    public int getSalary() {
        return salary;
    }

    // ТУТ объявляем СЕТТЕР для переменной SALARY
    // проверяем - ЕСЛИ передаваемая SALARY меньше чем SALARY у класса (this.salary),
    // то только в этом случае присваем новое значение
    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }

}
