package Labaratory_18;


import java.util.Arrays;

public class MassiveSorting {

    interface Checking{
        boolean shouldSwap(int a, int b);
    }

    public static void sort(int[] array, Checking cn) {
        if(array == null || array.length<= 1){return;}
        int length = array.length;
        boolean swap;

        for (int i = 0; i < length-1; i++) {
            swap = false;
            for (int j = 0; j < length-i-1; j++) {
                if(cn.shouldSwap(array[j], array[j+1])){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        sort(numbers, (a, b)->a>b);
        System.out.println("По возрастанию: " + Arrays.toString(numbers));

        sort(numbers, (a, b) -> a<b);
        System.out.println("По убыванию: " + Arrays.toString(numbers));
    }
}

