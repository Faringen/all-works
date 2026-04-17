package Labaratory_7;

import java.util.Scanner;

class Labaratory_7{
    static void main(){
        Scanner in = new Scanner(System.in);
        Bus[] busses = new Bus[3];
        busses[0] = new Bus("Иванов Н.Б.", 6, "C31", 2, 10000);
        busses[1] = new Bus("Смирнов А.Н.", 1, "Р321", 1, 2000);
        busses[2] = new Bus("Петров И.И.", 21, "М73", 5, 220300);
        System.out.println("Введите номер маршрута.");
        int targetLane = in.nextInt();
        System.out.println("Вот данные автобуса: ");
        for(int i = 0; i < busses.length; i++){
            if(targetLane == busses[i].numberLane){
                busses[i].returnBus();
            }
        }
        System.out.println("Введите минимальный пробег:");
        int targetRun = in.nextInt();
        System.out.println("У данного автобуса пробег больше: ");
        for (int i = 0; i < busses.length; i++) {
            if(targetRun <= busses[i].run){
                busses[i].returnBus();
            }
        }
    }
}
class Bus{
    String name, marks;
    int numberLane, age, run;
    Bus(String name, int numberLane, String marks, int age, int run){
        this.name = name;
        this.numberLane = numberLane;
        this.marks = marks;
        this.age = age;
        this.run = run;
    }
    void returnBus(){
        System.out.printf("Имя: %s\tНомер маршрута: %d\tМарка автобуса: %s\tГод эксплотации: %d\tПробег: %d.\n", name, numberLane, marks, age, run);
    }
}