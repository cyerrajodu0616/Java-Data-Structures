package Searching;

import java.util.Arrays;

public class problem57Bruteforce {

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3, 2, 2, 2};
        int counter = 0;
        int threshold_counter = a.length / 2;

        for (int i=0;i<a.length-1;i++) {
            counter = 1;
            for(int j = i+1;j < a.length;j++){
                if (a[i] == a[j]){
                    counter++;
                }
                if (counter > threshold_counter){
                    System.out.println(" element appeared more than half of array size : "+ a[i]);
                    System.exit(0);
                }
            }
        }

        System.out.println("There is no element in givene array greater than half of the size");
    }

}
