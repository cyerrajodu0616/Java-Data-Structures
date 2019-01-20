package Searching;

import java.util.Arrays;
import java.util.HashMap;

public class Duplicate_Ele_Array_Using_Hash {

    public static void main (String args[]){

        int a[] = {1,2,3,4,5,6,7,4};
        HashMap<Integer,Integer> temp_hash_map = new HashMap<Integer, Integer>();

        Arrays.sort(a);

        for(int i = 0;i<a.length-1;i++)
        {
            if (a[i] == a[i+1]){
                System.out.println("Have Duplicate");
                System.exit(0);
            }
        }

        int counter = 0;

        for (int x: a){
            if(temp_hash_map.containsKey(x)){
                System.out.println("Having duplicate element");
            }
            else
            temp_hash_map.put(x,x);
        }

        System.out.println("Not having Duplicate elements");
    }
}
