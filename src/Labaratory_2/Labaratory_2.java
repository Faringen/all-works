package Labaratory_2;

import java.util.Scanner;

class Labaratory_2{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество повторений:");
        double count = input.nextDouble();
        System.out.println("Введите значение x(<1):");
        double x = input.nextDouble();
        System.out.println("arccos = " + formula(count, x));
        System.out.println(Math.acos(x));

    }
    static double formula(double i, double x){
        double res = x;
        if(Math.abs(x)<1){
            for (int n = 1; n <= i; n++) {
                double up = (2*n - 1) * Math.pow(x, 2 * n + 1);
                double down = 2 * n *(2*n + 1);
                res += up/down;
            }
        }
        return (Math.PI/2)-res;
    }
}