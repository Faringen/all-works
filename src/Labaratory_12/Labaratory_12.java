package Labaratory_12;

public class Labaratory_12 {
    static void main(){
        User user1 = new Student("Иван", 20, "Казначей", 2, "Инфо-мат");
        User user2 = new Teacher("Роман", 45, "Преподовательство на пол.ставки", 20000, 20);
        user1.printLogin("newLogin");
        user2.printPassword("qwerty12345");
        //Создать интерфейс "Пользователь"с методами, работающие с логином и паролем. Создать абстрактный класс People, применяющий этот интерфейс, с полями "ФИО", "возраст", "должность". Создать два класса-наследника - "Преподаватель" и "Студент". Создать по два объекта данных классов.
    }
}
interface User{
    void printLogin(String login);
    void printPassword(String password);
}
abstract class People implements User{
    String fio, post;
    int age;
    People(String fio, int age, String post){
        this.fio= fio; this.age = age; this.post = post;
    }
}
class Student extends People{
    String faculsity;
    int course;
    Student(String fio,int age, String post, int course, String faculsity){
        super(fio,age,post);
        this.course = course;
        this.faculsity = faculsity;
    }
    public void printLogin(String login){
        System.out.println("Login for Student - " + login);
    }
    public void printPassword(String password){
        System.out.println("Password for Student - " + password);
    }
}
class Teacher extends People{
    int salary, workExp;
    Teacher(String fio, int age, String post, int salary, int workExp){
        super(fio, age, post);
        this.salary = salary;
        this.workExp = workExp;
    }
    public void printLogin(String login){
        System.out.println("Login for Teacher - " + login);
    }
    public void printPassword(String password){
        System.out.println("Password for Teacher - " + password);
    }
}

