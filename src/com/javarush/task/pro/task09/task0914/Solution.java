package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk-23434/bin/";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        // получаем индекс, где есть JDK. Первая часть пути
        int firstIndexWithJdk = path.indexOf("jdk");
        // получаем индекс длявторой части пути
        int firstIndexWithBin = path.indexOf("/", firstIndexWithJdk);
        // Получаем первую подстроку по индексу
        String substring1 = path.substring(0, firstIndexWithJdk);
        // Получаем вторую подстроку по индексу
        String substring2 = path.substring(firstIndexWithBin);
        String finalPath = (substring1 + jdk + substring2);

        // !!! МОЖНО сократить до 1 строки
        //  String finalPath2 = path.substring(0, path.indexOf("jdk")) + jdk +  path.substring(path.indexOf("/", firstIndexWithJdk));


        return finalPath;
    }
}
