package Searching;

import java.util.Arrays;

public class Max_no_Of_Apper {

    public static void main(String[] args){

        int a[] = {1,2,3,4,3,4,2,4,5,4,6,4,6,7,0};
        Arrays.sort(a);
        int maxim = 0;
        int counter=1;
        for(int i = 0;i<a.length-1;i++){
            if (a[i] == a[i+1]){
                counter = counter+1;
            }
            else
            {
                maxim = java.lang.Math.max(maxim,counter);
                counter = 1;
            }
        }

        System.out.println("Max no.of Appearance is : "+ maxim);


    }

}
