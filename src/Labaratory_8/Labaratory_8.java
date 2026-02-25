package Labaratory_8;

class Labaratory_8{

}
class Person{
    String name, surname;
    int birtDay;
    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.birtDay = age;
    }
    void returnPerson(){
        System.out.println("Имя: " + name + "\tФамилия: " + surname + "\tДата рождения: " + birtDay);
    }
    void takeAllClass(){

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
    void returnPersonCar(){
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
        System.out.println("Название книги:" + bookName + "\tАвтор: " + author + "\tГод выхода: "+ bookYearRelease);
    }
}