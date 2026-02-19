package Labaratory_3;

import java.util.Arrays;
import java.util.Scanner;

class Labaratory_3 {
    static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int count = in.nextInt();
        int[] sortArr = new int[count];
        for(int i = 0; i<count; i++){
            sortArr[i] = in.nextInt();
        }
        insertionSort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
    public static void insertionSort(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            if(sortArr[i] % 2 ==0){
                int swap = sortArr[i];
                for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                    sortArr[j] = sortArr[j - 1];
                }
                sortArr[j] = swap;
            }
        }
    }
}