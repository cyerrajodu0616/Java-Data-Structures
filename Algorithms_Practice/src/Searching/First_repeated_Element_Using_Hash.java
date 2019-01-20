package Searching;

import java.util.HashMap;

public class First_repeated_Element_Using_Hash {

    public static void main(String args[]){

        int a[] = {1,2,3,4,5,6,7,5,98,6,7,98};
        HashMap<Integer,Integer> a_temp = new HashMap();

        for(int x: a){
            if(a_temp.containsKey(x)){
                System.out.println("First Repeated element :" + x);
                System.exit(0);
            }
            else
                a_temp.put(x,x);
        }

         System.out.println("There are no repeted elements");
    }
}
