package Searching;

public class Duplicate_Ele_In_Array {

    public static void main (String args[]){

        int[] a = {1,2,3,4,5,6};

        for(int i=0;i<a.length;i++){

            for (int j=i+1;j<a.length;j++)
                if (a[i] == a[j]){
                System.out.println("Have duplicate element: "+ a[i]);
                System.exit(0);
                }

        }

        System.out.println("There are no duplicate elements");
    }
}
