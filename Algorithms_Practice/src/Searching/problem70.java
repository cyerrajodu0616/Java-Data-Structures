package Searching;

import java.util.LinkedList;

public class problem70 {

    public static void main(String[] args){

        int[] a = {12,34,45,9,8,90,3};

        LinkedList<Integer> even_list = new LinkedList();
        LinkedList<Integer> odd_list = new LinkedList();
        LinkedList<Integer> combine_list = new LinkedList();

        for(int x: a){
            if( x%2 == 0)
                even_list.add(x);
            else
                odd_list.add(x);
        }

        combine_list.addAll(even_list);
        combine_list.addAll(odd_list);

        for(int x: combine_list){
            System.out.println(x);
        }



    }

}
