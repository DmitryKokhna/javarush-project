package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;
// добавляем "this" т.к. присвоить нужно переменной класса и НЕ статичесского
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}