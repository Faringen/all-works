package Labaratory_13;

public class Labaratory_13 {
    static void main(){
        Product coffee = new Coffee();
        Product doorlock = new DoorLock();
        Product pen = new Pen();
        coffee.returnInfo("Амереканно", 9);
        System.out.println("Price on door lock - "+ doorlock.returnPrice(1099, 32));
        pen.returnInfo("Ручка", 11);
        User user1 = new Reseller("Иван", 25102009);
        User user2 = new Client("Роман");
        User user3 = new Seller("Torcher", 68321);
        user1.returnLogin("NewLogin");
        user2.returnPassword(4123);
        BuyingNewspaper n = new BuyingNewspaper("lFsa", 4123);
        n.returnInfo("Apple", 8);
        n.buing();
    }

    // В этом классе создать метод выводящий сообщение, что такой-то пользователь купил такой-то товар. Создать экземпляр этого класса.
}
interface Product{
    void returnInfo(String nameProduct, int rating);
    int returnPrice(int price, int count);
}
interface User{
    void returnLogin(String login);
    default void returnPassword(int password){
        System.out.println("Password for user - " + password);
    }
}
class Coffee implements Product{
    public void returnInfo(String name, int rating){
        if(rating<0 || rating>10){
            System.out.println("Coffee name - "+ name + "\tRating - Undefiled");
        }
        else {
            System.out.println("Coffee name - "+ name + "\tRating - " + rating + "/10");
        }
    }
    public int returnPrice(int price, int count){
        return price * count;
    }
}
class DoorLock implements Product{
    public void returnInfo(String nameProduct, int rating){
        if(rating<0 || rating>10){
            System.out.println("Door lock name - "+ nameProduct + "\tRating - Undefiled");
        }
        else {
            System.out.println("Door lock name - "+ nameProduct + "\tRating - " + rating + "/10");
        }
    }
    public int returnPrice(int price, int count){
        return price * count;
    }
}
class Pen implements Product{
    public void returnInfo(String nameProduct, int rating){
        if(rating<0 || rating>10){
            System.out.println("Pen name - "+ nameProduct + "\tRating - Undefiled");
        }
        else {
            System.out.println("Pen name - "+ nameProduct + "\tRating - " + rating + "/10");
        }
    }
    public int returnPrice(int price, int count){
        return price * count;
    }
}
class Reseller implements  User{
    String name;
    int birthday;
    Reseller(String name, int birthday){
        this.birthday = birthday;
        this.name = name;
    }
    public void returnLogin(String login){
        System.out.println("Login for" + this.name + " - " + login);
    }
}
class Client implements User{
    String name;
    Client(String name){
        this.name = name;
    }
    public void returnLogin(String login){
        System.out.println("Login for client - " + login);
    }
}
class Seller implements User{
    String username;
    int id;
    Seller(String username, int id){
        this.id = id;
        this.username = username;
    }
    public void returnLogin(String login){
        System.out.println("Login for seller - " + login);
    }
}
class BuyingNewspaper implements User, Product{
    String nameUser, productName;
    int id;
    BuyingNewspaper(String nameUser, int id){
        this.id = id;
        this.nameUser = nameUser;
    }
    public void returnInfo(String name, int rating){
        if(rating<0 || rating>10){
            System.out.println("Product name - "+ name + "\tRating - Undefiled");
        }
        else {
            System.out.println("Product name - "+ name + "\tRating - " + rating + "/10");
        }
        this.productName = name;
    }
    public int returnPrice(int price, int count){
        return (price - 500)* count;
    }
    public void returnLogin(String login){
        System.out.println("Login for user - " + login);
    }
    void buing(){
        if(this.productName == null){
            System.out.println(this.nameUser + " buing some Undefiled product.");
        }
        else{
            System.out.println(this.nameUser + " buying some " + this.productName);
        }
    }
}