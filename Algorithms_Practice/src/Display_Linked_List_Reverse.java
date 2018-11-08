import java.util.LinkedList;
import java.util.HashMap;

public class Display_Linked_List_Reverse {

    public static void main(String args[]){

        LinkedList<String> Input_List = new LinkedList<String> ();
        HashMap<Integer,String> Aux_HashMap = new HashMap<>();

        Input_List.add("A");
        Input_List.add("B");
        Input_List.add("C");
        Input_List.add("D");

        int i = 0;
        for(String e: Input_List){
            i++;
            System.out.println("Before " +i);
            Aux_HashMap.put(i,e);
            System.out.println("inside loop " + i);
        }

        System.out.println(i);

        for(int j=i;j>0;j--){
            System.out.println(" List in reverse " + Aux_HashMap.get(j));
        }

    }

}
