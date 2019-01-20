package Searching;

public class First_Repeated_Elements {

    public static void main (String args[]){

        int[] a = {1,2,3,4,3,2,2,4};

        for(int i = 0; i < a.length; i++){

            for(int j=i+1; j< a.length;j++)
                if (a[i] == a[j]){
                System.out.println("This is first repeated element :" + a[i]);
                System.exit(0);
                }

        }

        System.out.println("There are no repeted elements in give array");


    }

}
