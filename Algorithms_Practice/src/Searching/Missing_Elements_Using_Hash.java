package Searching;

import java.util.HashMap;

public class Missing_Elements_Using_Hash {

    public static void main (String[] args){

        int[] a = {8,3,2,6,4,7,5};
        HashMap temp_a = new HashMap();

        for(int x: a){
            temp_a.put(x,x);
        }

        for(int i=1;i<=a.length+1;i++){
            if(!temp_a.containsKey(i)){
                System.out.println(" Missing Element :"+ i);
                System.exit(0);
            }
        }

        System.out.println("There are no Missing Elements");

    }
}
