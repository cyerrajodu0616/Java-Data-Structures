package Selection;

import java.util.Arrays;

public class problem7 {

    public static void main(String[] args) {

        int[] a = {34, 8, 10, 3, 2, 80, 30, 1, 33};

        int k = 10;

        if(k > a.length){
            System.out.println("Array size is less than k");
            System.exit(0);
        }
        Arrays.sort(a);

        for(int i=0;i<k;i++){
            System.out.println(a[i]);
        }


    }
}
