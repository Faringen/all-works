package Labaratory_5;

import java.util.Scanner;

class Labaratory_5{
    static void main(){
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        Equation newPrimer = new Equation(first,second,third);
        int one = newPrimer.first();
        int two = newPrimer.second();
        int three = newPrimer.third();
        System.out.printf("3x+5 при x=%d = " + one +
                "\n(a+b)/(a-b) при a=%d и b=%d = " + two +
                "\n(a*x)/b! при a=%d, b=%d, x=%d = " + three,
                newPrimer.x, newPrimer.a, newPrimer.b, newPrimer.a, newPrimer.b, newPrimer.x);
    }
}
class Equation{
    int x, a, b;
    Equation(int x, int a, int b){
        this.a = a;
        this.x = x;
        this.b = b;
    }
    int first(){
        return 3*x+5;
    }
    int second(){
        int up = a+b;
        int down = a-b;
        if (down == 0) return -1;
        return up/down;
    }
    int third(){
        return getFactorial((a*x)/b);
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

}
