package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {
    //напишите тут ваш код
    // ТУТ создаем переменную с доступом private
    private Engine engine;

    public class Engine {
        // ТУТ создаем переменную с доступом private без инициализации
        private boolean isRunning;

        //ТУТ метод1 устанавливающий перемеммую
        public void start() {
            isRunning = true;
        }

        //ТУТ метод1 устанавливающий перемеммую
        public void stop() {
            isRunning = false;
        }
    }

}
