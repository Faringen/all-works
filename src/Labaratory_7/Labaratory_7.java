package Labaratory_7;

import java.util.Scanner;

class Labaratory_7{

}
class Bus{
    String name, marks;
    int number, age, run;
    Scanner in = new Scanner(System.in);
    Bus(String name, int number, String marks, int age, int run){
        this.name = name;
        this.number = number;
        this.marks = marks;
        this.age = age;
        this.run = run;
    }
    void returnBus(){
        System.out.printf("Имя: %s\nНомер маршрута: %d\nМарка автобуса: %s\nГод эксплотации: %d\nПробег: %d.", name, number, marks, age, run);
    }
}