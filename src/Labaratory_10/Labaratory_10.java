package Labaratory_10;

class Labaratory_10{
 //Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
    // Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat.
    // Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
    // Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
    // Пусть этот метод распечатывает food и location пришедшего на прием животного.
    static void main(){
        Animal cat = new Cat("Муся", "кошачий корм", "дома");
        Animal dog = new Dog("Жулька", "мясо", "псарне");
        Animal horse = new Horse("Майдан", "яблоко", "конюшне");
        Veterinarian vet = new Veterinarian();
        cat.eat();
        dog.makeNoise();
        horse.sleep();
        vet.treatAnimal(cat);
    }
}
abstract class Animal{
    String food, location;
    Animal(String food, String location){this.food = food; this.location = location;}
    abstract void makeNoise();
    abstract void eat();
    abstract void sleep();
}
class Dog extends Animal {
    String name;

    Dog(String name, String food, String location) {
        this.name = name;
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Собака по кличке " + this.name + " спит");
    }

    public void eat() {
        System.out.println("Собака по кличке " + this.name + " ест " + food);
    }

    public void sleep() {
        System.out.println("Собака по кличке " + this.name + "отдыхает в " + location);
    }
}
class Cat extends Animal {
    String name;

    Cat(String name, String food, String location) {
        this.name = name;
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Кошка по кличке " + this.name + " спит");
    }

    public void eat() {
        System.out.println("Кошка по кличке " + this.name + " ест " + food);
    }

    public void sleep() {
        System.out.println("Кошка по кличке " + this.name + "отдыхает в " + location);
    }
}
class Horse extends Animal {
    String name;

    Horse(String name, String food, String location) {
        this.name = name;
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Лошадь по кличке " + this.name + " спит");
    }

    public void eat() {
        System.out.println("Лошадь по кличке " + this.name + " ест " + food);
    }

    public void sleep() {
        System.out.println("Лошадь по кличке " + this.name + "отдыхает в " + location);
    }
}
class Veterinarian{
    void treatAnimal(Animal animal){
        System.out.println("Животное ела " + animal.food + " находясь при этом в " + animal.location);
    }
}