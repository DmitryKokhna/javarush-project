package com.javarush.task.pro.task10.task1003;

/* 
Построим новый бизнес-комплекс JavaRush Business Center
*/

public class Skyscraper {
    private int floorsCount = 44;
    private String developer;

    //напишите тут ваш код
    public Skyscraper(){
        this.developer = "JavaRushDevelopment";
        
            }

            public Skyscraper(int floorsCount, String developer){
        this.developer = developer;
        this.floorsCount = floorsCount;
            }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
        System.out.println(skyscraper.floorsCount);
    }
}
