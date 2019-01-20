package Searching;

public class problem62_better_Solution {

    public static void main(String[] args){

         //int[] a = {1,1,1,1,1,2,3,4,5,6};

        int[] a = {1,2,2,2,2,2,3,4,5,6};
        //int[] a = {1,2,3,4,5,6,6,6,6,6};
        //int[] a = {1,2,3,5,5,5,6,7,8,9};

        for(int i=0; i < a.length-2;i++){

            if(a[i] == a[i+1] || a[i] == a[i+2]){
                System.out.println(" element in araay with size of 2n: "+ a[i]);
                System.exit(0);
            }

        }

    }

}
