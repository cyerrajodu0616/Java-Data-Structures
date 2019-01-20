package LinkedList;

import java.util.LinkedList;

public class problem58 {

    public static void main(String[] args){

        LinkedList a = new LinkedList();

        a.add(3);
        a.add(14);
        a.add(3);

        LinkedList b = new LinkedList();

        b.add(5);
        b.add(6);
        b.add(4);

        LinkedList c = new LinkedList();

        for(int i = 0; i< a.size();i++){

            int sum = Integer.parseInt(a.get(i).toString())+Integer.parseInt(b.get(i).toString());

            int coeff = sum/10;
            if(coeff > 0)
                sum=sum/10^coeff;

            c.add(sum);
            System.out.println(sum);
        }


    }
}
