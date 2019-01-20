package Searching;

import java.util.Arrays;

public class First_Repeated_Elem_Using_Sort {

    public static void main(String ars[]){

        int a[] = {1,2,3,4,5,4,5,4};
        Arrays.sort(a);

        for(int i =0;i < a.length-1;i++)
        {
            if(a[i] == a[i+1]){
                System.out.println("First repeated element: "+a[i]);
                System.exit(0);
            }
        }

        System.out.println("There are no repeated elements in give array");


    }
}
