package com.javarush.task.pro.task11.task1120;

import java.util.Scanner;

/* 
Все буквы маленькие
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine().toLowerCase();
        // ТУТ была убрана строка line.toLowerCase() т.е. ссылочные объекты не изменеемые
        // В строку  String line = console.nextLine() было добавлено toLowerCase() - получилось копирование в переменную line


        System.out.println(line);
    }
}
