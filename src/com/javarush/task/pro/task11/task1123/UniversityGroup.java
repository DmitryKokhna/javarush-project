package com.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Почувствуй себя деканом
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        //ТУТ УБРАЛИ цикд FOR-EACH т.к. обходить коллекцию и удалять элементы одновременно - нельзя
        // ИСПОЛЬЗОВАЛИ "removeIF" метод
students.removeIf(students-> students.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}