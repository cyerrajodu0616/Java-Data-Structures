package Searching;

import java.util.Arrays;

public class problem62 {

    public static void main(String[] args){

       // int[] a = {1,1,1,1,1,2,3,4,5,6};

        //int[] a = {1,2,2,2,2,2,3,4,5,6};
        //int[] a = {1,2,3,4,5,6,6,6,6,6};
        int[] a = {1,2,3,5,5,5,6,7,8,9};
        Arrays.sort(a);

        int low =0;
        int high = a.length;
        int mid = (low+high)/2;
        int counter = 0;

        if(a[0] == a[mid-1]){
            System.out.println(" 2n appearance in array: " + a[0]);
        }
        else if ( a[mid] == a[high-1]){
            System.out.println(" 2n appearance in array: " + a[mid]);
        }
        else {
            for(int x : a) {
             if( a[mid] == x){
                 counter ++;
                 if(counter == high/2){
                     System.out.println(" 2n appearance in array: " + a[mid]);
                 }
             }

            }
        }


    }

}
