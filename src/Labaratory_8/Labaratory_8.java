package Labaratory_8;

class Labaratory_8{
    static void main(String[] args){
        String name = "Иван", surname = "Петрович", age = "21.2.2001",
                mark = "A631",
                bookname = "Механика", author = "Крылов";
        int carReal = 2001, vol = 20, bookReal = 1996;
        Person per = new Person(name, surname, age);
        PersonCar car = new PersonCar(mark, carReal, vol);

        Book book = new Book(bookname, author, bookReal);

        per.returnPerson();
        car.returnCar();
        book.returnBook();
        per.takeAllClass(car,book);
    }
}
class Person{
    String name, surname, birtDay;

    Person(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.birtDay = age;
    }
    void returnPerson(){
        System.out.println("Имя: " + name + "\tФамилия: " + surname + "\tДата рождения: " + birtDay);
    }
    void takeAllClass(PersonCar car, Book book){
        System.out.println(this.name + " " + this.surname+ " читает книгу '"+ book.bookName + "' про машину " + car.mark);
    }
}
class PersonCar{
    String mark;
    int volume, yearRelease;
    PersonCar(String mark, int yearRelease, int volume) {
        this.mark = mark;
        this.yearRelease = yearRelease;
        this.volume = volume;
    }
    void returnCar(){
        System.out.println("Марка: " + mark + "\tГод выпуска: " + yearRelease + "\tОбъем двигателя " + volume);
    }
}
class Book{
    String bookName, author;
    int bookYearRelease;
    Book(String bookName, String author, int bookYearRelease){
        this.author = author;
        this.bookName = bookName;
        this.bookYearRelease = bookYearRelease;
    }
    void returnBook(){
        System.out.println("Название книги: " + bookName + " \tАвтор: " + author + "\tГод выхода: "+ bookYearRelease);
    }
}