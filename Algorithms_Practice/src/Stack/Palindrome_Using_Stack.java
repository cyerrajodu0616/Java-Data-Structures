package Stack;

import java.util.Stack;

import static java.lang.System.exit;

public class Palindrome_Using_Stack {

    public static void main(String args[]){

        if (args.length != 1 || args[0].length() == 0){
            System.out.println(" Required number of argument to program is 1 and received " + args.length + " input length is "+args[0].length());
            exit(1);
        }

        Stack aux_stack = new Stack();
        String input_String = "abcdXdcba";
        int X_Index = 0;

        for(int i=0;i<input_String.length();i++)
        {
            if(input_String.charAt(i) != 'X')
            {
                aux_stack.push(input_String.charAt(i));
            }
            else
            {
              X_Index = i  ;
              break;
            }
        }

        for(int j=X_Index+1;j<input_String.length();j++){
            if(!(aux_stack.isEmpty())) {
                if (input_String.charAt(j) != aux_stack.pop().toString().charAt(0)) {
                    System.out.println("Not Palindrome");
                    exit(1);
                }
            }
            else
            {
                System.out.println("Not Palindrome");
                exit(1);
            }
        }

        System.out.println("IS Palindrome");

    }
}
