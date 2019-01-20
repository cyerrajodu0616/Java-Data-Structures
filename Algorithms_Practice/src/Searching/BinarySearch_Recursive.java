package Searching;

public class BinarySearch_Recursive {

    public static void main(String args[]){

        //int[] a = {10,11,12,11,10,9,8,7,6,5,4};
        //int[] a = {10,11,13,12,11};
        int[] a = {10,11,12,13,14,15,3};
        int ele = 6;
        int low = 0;
        int high = a.length-1;


        while (low < high){
            //int mid = low + (high - low)/2;
            int mid = (low + high)/2;

            if (a[mid-1] < a[mid] && a[mid] > a[mid+1]){
                System.out.println("Changing point is: "+mid);
                break;
            }

            if ( a[mid-1] < a[mid]){
                low = mid;
            }
            else{
                high = mid;
            }

        }


    }
}
