package Searching;

import java.util.HashMap;

public class Finding_2_Elements_sum_K {

    static void find_elem_using_BF (int[] input,int k){

        System.out.println("Using Brute Force");

        int counter =0;

        for(int i=0;i<input.length-1;i++){
            for(int j = i+1;j<input.length;j++){
                if (input[i]+input[j] == k){
                    System.out.println("Required pair :" +input[i] +" and " +input[j]);
                    counter++;
                }
            }
        }
        if (counter == 0)
            System.out.println("There are no pairs in given array");

    }

    static void find_elem_using_hash(int[] input,int k){

        System.out.println("Using Hash Table");

        int counter =0;
        HashMap temp_input = new HashMap();
        for(int x: input)
            temp_input.put(x,x);

        for (int x:input){
            if(temp_input.containsKey(k-x)){
                System.out.println("Required pair :" +x +" and " +temp_input.get(k-x));
                counter++;
            }
        }

        if (counter == 0)
            System.out.println("There are no pairs in given array");

    }




    public static void main(String[] args){

        int[] a = {1,2,3,4,5,6,7,8,9};
        int required_number = 15;
        find_elem_using_BF(a,required_number);
        find_elem_using_hash(a,required_number);

    }

}
