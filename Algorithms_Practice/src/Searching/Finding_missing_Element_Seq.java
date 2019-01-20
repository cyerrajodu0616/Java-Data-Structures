package Searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Finding_missing_Element_Seq {

    public static void main (String args[]){

        int[] a = {3,7};
        int n = 10;
        HashMap temp_a = new HashMap();
        Stack temp_stack = new Stack();

        StringBuffer missing_Numbers = new StringBuffer("");
        int starting_ele = a[0];
        int previous_missing_number = -2;

        //StringBuffer missing_Numbers = new StringBuffer("");
        int initial_seq_number;
        int counter =0;
        StringBuffer str_to_add = new StringBuffer("");
        for(int i =0; i<=10;i++){
            if(! temp_a.containsKey(i)){

                if(temp_stack.isEmpty()){
                    temp_stack.push(new Integer(i));
                    previous_missing_number = i;
                }
                else {
                    if ( previous_missing_number == i - 1){
                        previous_missing_number=i;
                        counter++;
                    }
                }

            }
            else{
                if((int)temp_stack.peek() != previous_missing_number){
                    missing_Numbers.append(temp_stack.pop()).append('-').append(previous_missing_number).append(',');
                    counter = 0;
                }
                else
                {
                    missing_Numbers.append(temp_stack.pop()).append(',');
                    counter = 0;
                }
            }
        }

        if((int)temp_stack.peek() != previous_missing_number){
            missing_Numbers.append(temp_stack.pop()).append('-').append(previous_missing_number).append(',');
            counter = 0;
        }
        else
        {
            missing_Numbers.append(temp_stack.pop()).append(',');
            counter = 0;
        }

        System.out.println(missing_Numbers);
    }
}
