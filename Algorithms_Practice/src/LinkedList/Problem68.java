package LinkedList;

import java.util.LinkedList;

public class Problem68 {

    public static void main(String[] args){

        LinkedList<Integer> a = new LinkedList();

        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        LinkedList<Integer> temp = new LinkedList();
        LinkedList<Integer> temp_even = new LinkedList();

        for(int x : a){

            if (x%2 != 0) {
                temp.add(x);
            }else {
                temp_even.add(x);
            }

        }

        temp_even.addAll(temp);

        for(int x: temp_even)
            System.out.println(x);

        LinkedList<Integer> temp_all = new LinkedList();


    }

}
