package LinkedList;

import com.sun.org.apache.xpath.internal.Arg;

import java.util.ListIterator;
import java.util.LinkedList;

import static java.lang.System.exit;

public class Finding_N_Element {

    public static void main(String[] args){
        LinkedList<Integer> input_List = new LinkedList<Integer>();
        input_List.add(1);
        input_List.add(2);
        input_List.add(3);
        input_List.add(4);

        int n_index = Integer.parseInt("2");

        int list_length = 0;

        ListIterator itr = input_List.listIterator();
        ListIterator itr_1 = input_List.listIterator();

        int nth_item_1 = 0;

        while(itr.hasNext())
        {
            list_length++;
            nth_item_1 = Integer.parseInt(itr.next().toString());
            //System.out.println(itr.next());

        }

        System.out.println("List Length: " + list_length);

        if (n_index > list_length)
        {
            System.out.println("Given list is less than the nth value asked");
            exit(1);
        }
         else
        {
            int req_item = list_length - n_index;
            int i = 0;
            int nth_item = 0;
            while(itr_1.hasNext() && i < req_item)
            {
                i++;
                nth_item = Integer.parseInt(itr_1.next().toString());
                //System.out.println(nth_item);
            }

            System.out.println(" Nth item in list is "+ itr_1.next());
        }

        // using foreach
        int Foreach_Length = 0;
        for (Integer e: input_List){
            Foreach_Length++;
        }


        int req_item = Foreach_Length - n_index;
        int i_item = 0;
        int nth_item = 0;
        for (Integer x : input_List
             ) {
            if(i_item < req_item )
            {
                i_item++;
            }
            else {
                System.out.println(x);
                exit(0);
            }
        }

    }
}
