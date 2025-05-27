package com.javarush.task.pro.task12.task1202;

/* 
Распаковка
*/

public class Solution {
    Byte byteValueBox;
    Short shortValueBox;
    Integer integerValueBox;
    Long longValueBox;

    Float floatValueBox;
    Double doubleValueBox;

    Character characterValueBox;
    Boolean booleanValueBox;

    //напишите тут ваш код
// ТУТ создаем ПРИМИТИВНУЮ переменную и инициализируем ее через ОБЪЕКТ соответсствующего типа
    // с вызовом метода от соответствующего типа "типValue()"
    byte byteValue = byteValueBox.byteValue();
    short shortValue = shortValueBox.shortValue();
    int intValue = integerValueBox.intValue();
    long longValue = longValueBox.longValue();
    float floatValue = floatValueBox.floatValue();
    double doubleValue = doubleValueBox.doubleValue();
    char charValue = characterValueBox.charValue();
    boolean booleanValue = booleanValueBox.booleanValue();
}
