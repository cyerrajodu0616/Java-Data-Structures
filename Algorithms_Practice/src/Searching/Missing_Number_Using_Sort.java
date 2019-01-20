package Searching;

import java.util.Arrays;

public class Missing_Number_Using_Sort {

    public static void main(String args[]){

        int[] a = {1,2,4,3,7,6};

        Arrays.sort(a);

        int missing_elements = 0;

        for(int i=0;i<a.length;i++){
            if (a[i]+1 != a[i+1]){
                missing_elements = a[i]+1;
                System.out.println("Missing Element: "+ missing_elements);
                System.exit(0);
            }
        }

        System.out.println("There are no missing elements");

    }

}
