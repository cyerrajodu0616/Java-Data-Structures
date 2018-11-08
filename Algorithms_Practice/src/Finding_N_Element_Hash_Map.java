import java.util.LinkedList;
import java.util.HashMap;
import static java.lang.System.exit;
public class Finding_N_Element_Hash_Map {

    public static void main(String[] args){

        LinkedList<String> Input_List = new LinkedList<String> ();

        int nth_index = 2;
        Input_List.add("A");
        Input_List.add("B");
        Input_List.add("C");
        Input_List.add("D");

        HashMap<Integer,String> Aux_HashMap = new HashMap<Integer,String> ();

        int i=0;

        for(String e:Input_List)
        {
            Aux_HashMap.put(i,e);
            i++;
        }

        int list_Length = i;

        System.out.println("Length of input " + list_Length);

        if(nth_index > list_Length ){
            System.out.println("Invalid Index");
            exit(1);
        }
        else {
            int required_index = i - 2;

            System.out.println("Required Index " + required_index);
            System.out.println("Item at nth position from end is " + Aux_HashMap.get(required_index));
        }
    }

}
