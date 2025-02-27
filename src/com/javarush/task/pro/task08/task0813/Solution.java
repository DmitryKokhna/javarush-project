package com.javarush.task.pro.task08.task0813;

/* 
Степень двойки
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(4));
    }

    public static int getPowerOfTwo(int power) {
        int result = 1;
        if(power>=0){
            return result << power;
        } else {
            return result >> power;
        }



    }
}
