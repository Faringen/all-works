package Labaratory_11;

class Labaratory_11 {
    //Создать класс Person с private полем возраст и public полями ФИО, Телефон.
    // Создать класс-наследник Student с дополнительными public полями - Курс, Факультет и private полем дата поступления.
    // Создать массив из трех объектов класса Student.
    // Вывести: а) ФИО и возраст всех студентов б) список студентов заданного факультета; в) список студентов, поступивших после заданного года.
    static void main(){
        Person[] students = new Student[]{
                new Student("Иванов И.И.", 18, "739200124", 1, "Экономика", 2025),
                new Student("Петров П.П.", 20, "8996238104", 2, "Экономика", 2021),
                new Student("Сидоров С.С.", 25, "8900333", 3, "Био-мат", 2019)
        };
        System.out.println("-----ФИО ВСЕХ СТУДЕНТОВ------");
        for(Person p : students){
            System.out.println(p.fullname + " \t " + p.getAge());
        }

        String targetF = "Био-мат";
        System.out.println("-----СПИСОК СТУДЕНТОВ ПОСТУПИВШИЕ НА " + targetF + "-----");
        for (Student s : (Student[]) students){
            if(s.facultet == targetF){
              System.out.println(s.display());
            }
        }

        int ageTarget = 2021;
        System.out.println("-----СПИСОК СТУДЕНТОВ ПОСТУПИВШИЕ ПОСЛЕ "+ ageTarget +"-----");
        for (Student s :(Student[]) students){
            if(s.getAgeOfEntrance() <= ageTarget){
                System.out.println(s.display());
            }
        }
    }
}
class Person{
    private int age;
    public String fullname, phoneNumber;
    Person(String fullname, int age, String phoneNumber){
        this.age = age;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
    }

    public int getAge(){
        return age;
    }
}
class Student extends Person{
    public int course;
    public String facultet;
    private int ageOfEntrance;
    Student(String fullname, int age, String phone, int course, String facultet, int ageOfEntrance){
        super(fullname, age, phone);
        this.course = course;
        this.facultet = facultet;
        this.ageOfEntrance = ageOfEntrance;
    }

    String display(){
        return  "Студент: " + fullname + ", Факультет: " + facultet + ", Год поступления: " + ageOfEntrance;
    }


    public int getAgeOfEntrance() {
        return ageOfEntrance;
    }
}
