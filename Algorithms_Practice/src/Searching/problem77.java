package Searching;

public class problem77 {

    public static void main(String[] args){

        int[] a = {0,2,4,1,3,5};
        int temp;
        int n = 3;
        for(int i =0 ; i <n ; i++ ){

            for(int j = n; j<2*n ;j++){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }



    }
}
