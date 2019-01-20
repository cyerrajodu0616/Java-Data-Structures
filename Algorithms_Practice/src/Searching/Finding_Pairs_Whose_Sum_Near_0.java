package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.StrictMath.abs;

public class Finding_Pairs_Whose_Sum_Near_0 {

    static void find_pair_using_bf_1(int[] input){

        int min = 1000000;
        HashMap<Integer,String> temp_inpt = new HashMap();
        for(int i = 0;i< input.length-1;i++){
            for(int j=i+1;j<input.length;j++){
                temp_inpt.put(abs(input[i]+input[j]),""+input[i]+" "+input[j]);
            }
        }

        for(int x:temp_inpt.keySet() ){
            min = java.lang.Math.min(min,abs(x));
        }

        System.out.println(" Closest pair is :" + temp_inpt.get(min));


    }

    static void find_pair_using_bf(int[] input){

        int min = 1000000;
        int temp_i = 0;
        int temp_j = 1;
        for(int i = 0;i< input.length-1;i++){
            for(int j=i+1;j<input.length;j++){
                if(java.lang.Math.abs(min) > java.lang.Math.abs(input[i]+input[j])){
                    min = java.lang.Math.abs(input[i]+input[j]);
                    temp_i = i;
                    temp_j = j;
                }
            }
        }


        System.out.println(" Closest pair is :" + input[temp_i] + " " + input[temp_j]);


    }

    public static void main(String[] args){

        int[] a = {1,60,-10,70,80,-85,90,-95};
        find_pair_using_bf(a);
        find_pair_using_bf_1(a);
    }

}
