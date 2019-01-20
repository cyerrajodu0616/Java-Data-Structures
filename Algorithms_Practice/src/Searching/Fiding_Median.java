package Searching;

import java.util.Arrays;

public class Fiding_Median {

    public static void main(String[] args){

        int[] a = {3,2,4,1,10,8,5,9,11};
        Arrays.sort(a);


        if( a.length%2 == 0 ){
            int mid = (a.length)/2;
            int median = (a[mid-1] + a[mid])/2;
            System.out.println( median);
        }else{
            System.out.println(a[((a.length+1)/2)-1]);
        }

    }

}
