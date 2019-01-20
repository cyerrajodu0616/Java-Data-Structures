package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class problem69 {

    public static void main (String[] args){

        LinkedList a = new LinkedList();

        a.add(3);
        a.add(5);
        a.add(10);
        a.add(11);
        a.add(12);
        a.add(20);

        LinkedList b = new LinkedList();

        b.add(1);
        b.add(3);
        b.add(15);
        b.add(16);
        b.add(20);

        ListIterator<Integer> alistiter = a.listIterator();
        ListIterator<Integer> blistiter = b.listIterator();

        int aele = alistiter.next();
        int bele = blistiter.next();

      /*  if(aele == bele){
            System.out.println(alistiter.next());*/

        while(alistiter.hasNext() || blistiter.hasNext()){

            if(aele == bele){
                System.out.println(aele);
                bele=blistiter.next();
                aele=alistiter.next();
            }else if(aele > bele){
                bele=blistiter.next();
            }else{
                aele=alistiter.next();
            }

        }

        if(aele == bele)
            System.out.println(aele);

    }

}
