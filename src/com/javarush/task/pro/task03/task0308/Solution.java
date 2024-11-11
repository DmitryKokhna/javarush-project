package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int coordinateX = scanner.nextInt();
        int coordinateY = scanner.nextInt();

        if (coordinateX > 0 && coordinateY > 0) {
            System.out.println(1);
        } else if (coordinateX < 0 && coordinateY > 0) {
            System.out.println(2);
        } else if (coordinateX < 0 && coordinateY < 0) {
            System.out.println(3);
        } else if (coordinateX > 0 && coordinateY < 0) {
            System.out.println(4);
        }
    }
}
