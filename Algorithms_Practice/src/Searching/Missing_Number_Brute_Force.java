package Searching;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Missing_Number_Brute_Force {

    public static void main(String args[]){

        int a[] = {1,2,4,6,3,7,8};

        int missing_element = 0;


        System.out.println("Size :"+a.length);
        for (int i=1 ; i<= a.length+1; i++ )
        {
            Boolean found = false;
            for(int x:a){
                if (i == x)
                {
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("Missing Element: "+i);
                System.exit(0);
            }
        }

    }

}
