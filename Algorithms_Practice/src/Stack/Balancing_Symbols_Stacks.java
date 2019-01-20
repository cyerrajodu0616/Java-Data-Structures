package Stack;

import java.lang.reflect.Array;
import java.util.Stack;

import static java.lang.System.exit;
import static java.lang.System.out;

public class Balancing_Symbols_Stacks {

    public static void main(String[] args){

        if (args.length != 1){
            System.out.println("Required parameters is 1 but passed " + args.length);
            exit(1);
        }

        Stack Balance_Symbol = new Stack();
        String Input_Expresion = args[0];

        if(Input_Expresion.length() == 0 ){
            System.out.println("Input parameter is not having any data");
            exit(1);
        }

        System.out.println("Given Expression "+Input_Expresion);

        char[] Input_split = Input_Expresion.toCharArray();
        for(char x: Input_split){
            if( (x == '(') || (x == '[') || (x =='{')){
                Balance_Symbol.push(x);
            }
            switch (x)
            {
                case ')' :
                    if(!(Balance_Symbol.isEmpty())) {
                        if (!("(".equals(Balance_Symbol.pop().toString()))) {
                            System.out.println("Given expression is not balanced");
                            exit(1);
                        }
                    }
                    else {
                        System.out.println("Given expression is not balanced");
                        exit(1);
                    }
                    break;
                case ']' :
                    if(!(Balance_Symbol.isEmpty())) {
                        if (!("[".equals(Balance_Symbol.pop().toString()))) {
                            System.out.println("Given expression is not balanced");
                            exit(1);
                        }
                    }
                    else {
                        System.out.println("Given expression is not balanced");
                        exit(1);
                    }
                    break;
                case '}' :
                    if(!(Balance_Symbol.isEmpty())) {
                        if (!("{".equals(Balance_Symbol.pop().toString()))) {
                            System.out.println("Given expression is not balanced");
                            exit(1);
                        }
                    }
                    else {
                        System.out.println("Given expression is not balanced");
                        exit(1);
                    }
                    break;
            }
        }

        if (Balance_Symbol.isEmpty()) {

            System.out.println("Given expresion is balanced");
        }
        else
        {
            System.out.println("Given expression is not balance");
        }


    }
}
