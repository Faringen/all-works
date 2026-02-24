package Labaratory_6;

class Labaratory_6{

}
class Reader{
    String name, number, facultet,data, phoneNumber;
    Reader(String name, String number, String facultet, String data, String phoneNumber){
        this.name =name;
        this.data = data;
        this.number = number;
        this.facultet = facultet;
        this.phoneNumber = phoneNumber;
    }
    void takeBook(int countBook){
        System.out.printf("%s взял %d книги.", name, countBook);
    }
    void returnBook(int countBook){
        System.out.printf("%s вернул %d книги.", name, countBook);
    }
}