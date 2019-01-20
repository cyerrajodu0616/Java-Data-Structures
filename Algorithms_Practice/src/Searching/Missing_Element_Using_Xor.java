package Searching;

public class Missing_Element_Using_Xor {

    public static void main (String[] args){

        int[] a = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};

        int n = a.length;
        int x = 0;
        for(int i: a){
            x = i^x;
        }
        System.out.println(x);

    }

}
