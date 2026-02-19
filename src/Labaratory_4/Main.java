package Labaratory_4;

import java.util.Arrays;

class Labaratory_4{
  static void main(){
    int[] massive = {5,6,1,2,5,4};
    System.out.println(Arrays.toString(massive));
    shacherSort(massive);
    System.out.println(Arrays.toString(massive));
  }
  public static void shacherSort(int[] valve){
    int left = 0;
    int right = valve.length -1;
    while(left<=right){
      for (int i = right; i > left; i--) {
        if(valve[i-1] > valve[i]){
            int temp = valve[i];
            valve[i] = valve[i - 1];
            valve[i - 1] = temp;

        }
      }
      ++left;
      for (int i = left; i < right; i++) {
        if(valve[i]>valve[i+1]){
            int temp = valve[i + 1];
            valve[i + 1] = valve[i];
            valve[i] = temp;
        }
      }
    }
    --right;
  }
}