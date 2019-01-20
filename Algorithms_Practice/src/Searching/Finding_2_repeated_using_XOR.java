package Searching;

public class Finding_2_repeated_using_XOR {

    public static void main (String args[]){

        int[] a = {1,2,3,4,3,5,5};
        int x = 0;

        for(int i:a){
            x = x^i;
        }

        for(int i =1; i<6;i++){
            x = x^i;
        }

        System.out.println(x);

    }
}
