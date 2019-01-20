package LinkedList;

import static LinkedList.LinkedListUser.insert;

public class Problem2 {

    public static void main (String[] args){

        LinkedListUser list = new LinkedListUser();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);


        LinkedListUser.Node list_head = list.head;




    }

}
