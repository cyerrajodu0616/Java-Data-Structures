package Searching;

public class Problem79 {

    public static void main(String[] args){

        int[] a = {34, 8, 10, 3, 2, 80, 30, 1, 33};

        int low = 0;
        int high = a.length-1;

        int max = -1;

        while(high > low ){

            if(a[high] > a[low]){
                max = Integer.max(max,high-low);
                low++;
            }else{
                low++;
            }

            if(low == high){
                high--;
                low=0;
            }
        }

        System.out.println(max);

    }
}
