package Searching;

import java.util.Arrays;

public class Finding_Repeating_Elements {

    public static void main(String args[]){

        int[] a = {1,2,3,4,4,3,5};
        Arrays.sort(a);
        int counter =0;
        for(int i = 0;i<a.length-1;i++){
            if(a[i] == a[i+1]){
                System.out.println("Repeated Elements: " +a[i]);
                counter++;
            }
        }

        if(counter == 0){
            System.out.println("There are no repeated elements");
        }
    }

}
