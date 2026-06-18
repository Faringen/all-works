package Labaratory_19;

public class Atelier{
    public void main() {
        Clothes[] allClothes = new Clothes[]{
                new TShirt(ClothesSize.S, 1500, "Красный"),
                new Pants(ClothesSize.M, 3500, "Черный"),
                new Skirt(ClothesSize.XS, 2000, "Синий"),
                new Tie(ClothesSize.L, 900, "Серый")
        };

        getManDress(allClothes);
        getWomanDress(allClothes);
    }

    public void getManDress(Clothes[] ch) {
        System.out.println("-------------Мужская одежда-------------");
        for(Clothes clothes :  ch){
            if(clothes instanceof ManClothes){
                System.out.println("Тип: " + clothes.getClass().getSimpleName() +
                                ", Цвет: " + clothes.getColor() +
                                "Размер: " + clothes.getSize() + " (" +clothes.getSize().getDescription() + ")"+
                                ", Цена:" + clothes.getPrice());
                ((ManClothes) clothes).dressMan();
            }
        }
    }
    public void getWomanDress(Clothes[ ] ch) {
        System.out.println("-------------Женская одежда-------------");
        for(Clothes clothes :  ch){
            if(clothes instanceof WomanClothes){
                System.out.println("Тип: " + clothes.getClass().getSimpleName() +
                        ", Цвет: " + clothes.getColor() +
                        "Размер: " + clothes.getSize() + " (" +clothes.getSize().getDescription() + ")"+
                        ", Цена:" + clothes.getPrice());
                ((WomanClothes) clothes).dressWoman();
            }
        }
    }
}

abstract class Clothes {
    ClothesSize size;
    double price;
    String color;
    public Clothes(ClothesSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public ClothesSize getSize() { return size; }
    public double getPrice() { return price; }
    public String getColor() { return color; }

}
enum ClothesSize{
    XXS(32){
        @Override
        public String getDescription() {
            return "Детское";
        }
    },
    XS(34), S(36), M(38), L(40);

    private final int euroSize;
    ClothesSize( int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взрослый";
    }
}
interface ManClothes {
    void dressMan();
}

interface WomanClothes {
    void dressWoman();
}

class TShirt extends Clothes implements ManClothes, WomanClothes{

    public TShirt(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем футболку на мужчину. \n");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем футболку на женщину. \n");
    }
}
class Pants extends Clothes implements ManClothes, WomanClothes{

    public Pants(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем штаны на мужчину \n");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем штаны на женщину. \n");
    }
}
class Skirt extends Clothes implements WomanClothes{

    public Skirt(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем юбку на женщину. \n");
    }
}
class Tie extends Clothes implements ManClothes {

    public Tie(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем галстук на мужчину \n");
    }
}



