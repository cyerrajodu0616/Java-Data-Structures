package Searching;

import java.util.HashMap;

public class Max_No_Of_Appearance_Using_HAsh {

    public static void main (String[] args){

        int[] a = {1,2,4,3,5,2,3,4,1,2,11,3,2,1};

        HashMap<Integer,Integer> temp_a = new HashMap<>();
        int maxim = 0;

        for(int x: a){
            if(temp_a.containsKey(x)){
                temp_a.put(x,temp_a.get(x)+1);
            }
            else
                temp_a.put(x,1);
        }

        for(int x:temp_a.values()){
            maxim = java.lang.Math.max(maxim,x);
        }

        System.out.println("Maximum appearance is: "+maxim);
    }
}
