package Labaratory_5;

class Labaratory_5{

}
class Equation{
    int x, a, b;
    Equation(){
        this.a = a;
        this.x = x;
        this.b = b;
    }
    int first(){
        return 3*x+5;
    }
    int second(){
        return (a + b)/(a-b);
    }
    int thirt(){
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
