package Searching;

import java.util.Arrays;

public class Problem60 {

    public static void main (String[] args){
        int[] a = {1,1,1,1,1,2,3,4};

        Arrays.sort(a);

        int find_ele;
        int low = 0;
        int high = a.length - 1;
        int mid = (low+high)/2;
        int counter = 0;
        find_ele = a[mid];

        for(int x : a){
            if(x == find_ele){
                counter++;
                if ( counter > mid){
                    System.out.println(" maximum appearance of number: " + x);
                    System.exit(0);
                }
            }
        }

        System.out.println("Dont have high occurence");
    }
}
