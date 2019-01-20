package Searching;

public class Fiding_Repeated_Elemet_Using_Xor {

    public static void main (String[] args){

        int[] a = {1,4,5,1,5,2,4,2,5,2,3,4,3,3};
        int x =0,y=0;

        for(int q: a){
            x = x^q;
        }

        for(int i = 1;i<= 5 ;i++)
        {
            x = x^i;
        }

        System.out.println(x);
    }

}
