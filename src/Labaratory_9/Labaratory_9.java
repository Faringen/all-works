package Labaratory_9;

import java.lang.reflect.Field;

class Labaratory_9{
// Вывести: а) ФИО всех студентов б) список студентов заданного факультета; в) список студентов, поступивших после заданного года.
    static void main(String[] args){
        Student[] students = new Student[]{
                new Student("Иванов И.И.", 2020, "ул. Пушкина 1", "8900111", 4, "Экономика"),
                new Student("Петров П.П.", 2022, "ул. Лермонтова 5", "8900222", 2, "Экономика"),
                new Student("Сидоров С.С.", 2021, "ул. Гоголя 10", "8900333", 3, "Био-мат")
        };

        for(Student s : students){ System.out.println(s.getFIO());}

        String target = "Экономика";
        for(Student s : students){
            if(s.getFaculty() == target){
                System.out.println(s.getFIO() + "поступил на факультет: "+ s.getFaculty());
            }
        }

        int ageTarget = 2021;
        for (Student s : students){
            if(s.getAgeOfEntrance() <= ageTarget){
                System.out.println(s.display() + ", поступил после " + ageTarget);
            }
        }
    }

}
class Student{
    private String FIO, address, phone, faculty;
    private int ageOfEntrance, course;
    Student(String FIO, int ageOfEntrance, String address, String phone, int course, String faculty){
        this.FIO = FIO; this.ageOfEntrance = ageOfEntrance; this.address = address;
        this.phone = phone; this.course = course; this.faculty = faculty;
    }
    String getFIO(){return this.FIO;}
    String getAddress() { return this.address;}
    String getPhone(){ return this.phone;}
    String getFaculty(){ return this.faculty;}
    int getAgeOfEntrance(){ return this.ageOfEntrance;}
    void setFIO(String Fio){this.FIO = Fio;}
    void setAgeOfEntrance(int age){ this.ageOfEntrance = age;}
    void setPhone(String phoneNumber){ this.phone = phoneNumber;}
    void setCourse(int course){ this.course = course;}
    String display(){return  "Студент: " + FIO + ", Факультет: " + faculty + ", Год поступления: " + ageOfEntrance;}
}