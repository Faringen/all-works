package Labaratory_6;

class Labaratory_6{
    static void main(){
        Reader libery = new Reader("Сидоров В.А.", "312", "4 курс","25.12.2001", "8992543151");
        libery.takeBook(3);

    }
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
    void takeBook(String... book){
        System.out.printf("%s взял книги: ");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
            if(i < book.length-1) System.out.println(" , ");
        }
    }
    void returnBook(int countBook){
        System.out.printf("%s вернул %d книги.", name, countBook);
    }
    void returnBook(String... book){
        System.out.printf("%s отдал книги: ");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
            if(i < book.length-1) System.out.println(" , ");
        }
    }
}