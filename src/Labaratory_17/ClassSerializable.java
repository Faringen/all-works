package Labaratory_17;

import java.io.*;
import java.util.Scanner;

public class ClassSerializable {

    static void main(){
        Scanner s = new Scanner(System.in);
        String path = "/home/faringen/Документы/IdeaProjects/all-works/src/Labaratory_17/result.txt";
        System.out.println("Enter number:");
        double x = s.nextDouble();
        SinX form = new SinX(x);
        while (true){
            System.out.println("Enter command:");
            String input = s.next();
            if(input.equalsIgnoreCase("save")){
                try {
                    form.saveToFile(path);
                    System.out.println("File saved success");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(input.equalsIgnoreCase("upload")){
                try {
                    SinX newForm = SinX.uploadFromFile(path);
                    System.out.println("Data been upload in " + newForm);
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(input.equalsIgnoreCase("exit")){
                break;
            }
            else{
                System.out.println("Err");
            }
        }
    }

}
class SinX implements Serializable{
    private double x;
    private double y;
    SinX(double number){
        x = number;
        y = xMinusSinX(x);
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }

    public double xMinusSinX(double x){
        return x - Math.sin(x);
    }

    public void saveToFile(String path){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(this);
        }catch (Exception e){ System.out.println(e.getMessage());}
    }
    public static SinX uploadFromFile(String path) throws ClassNotFoundException, IOException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            return (SinX) ois.readObject();
        }
    }
}