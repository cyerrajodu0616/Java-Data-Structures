package Searching;

import java.util.HashMap;

public class Finding_Repeated_ele_Using_HAsh {

    public static void main(String args[]){

        int[] a = {1,2,3,4,3,5,5};
        HashMap temp_a = new HashMap();
        int counter =0;

        for(int x: a){
            if(temp_a.containsKey(x)){
                System.out.println("Repeated Element :" + x);
                counter++;
            }
            else{
                temp_a.put(x,x);
            }
        }

        if(counter == 0){
            System.out.println("There are no repeated elements");
        }
    }
}
