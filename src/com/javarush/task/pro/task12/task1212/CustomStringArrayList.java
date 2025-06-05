package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        //ТУТ увеличиваем емкость ArrayList
        capacity = (int) (capacity * 1.5);
        //ТУТ сознаем новый массив с размерность == увеличенной емкости
        String[] elementsGrow = new String[capacity];
        //ТУТ копируем старый массив в новый
        elementsGrow = Arrays.copyOf(elements,elements.length);
        //ТУТ копируем-переносим новый массив
        elements =Arrays.copyOf(elementsGrow,capacity);


    }

}
