package Searching;

public class Missing_Ele_Using_Xor {

    public static void main(String args[]){

        int[] a = {8,3,2,5,4,7,6};
        int n = a.length;
        int X=0,Y=0;

        for(int i:a){
            X = X^i;
        }

        for(int i=1;i<=a.length+1;i++){
            Y = Y^i;
        }

        System.out.println(X^Y);
    }

}
