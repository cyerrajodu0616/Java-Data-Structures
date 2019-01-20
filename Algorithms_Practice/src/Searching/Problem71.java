package Searching;

public class Problem71 {

    public static void main (String[] args){

        int[] a = {0,1,0,1,0,0,1,1,1,0};
        int low = 0;
        int high = a.length-1;
        int temp = -1;

        while(low < high){

            if(a[low] == 1){
                if(a[high] == 0){
                    temp = a[low];
                    a[low] = a[high];
                    a[high] = temp;
                    low++;
                    high--;
                }else {
                    high--;
                }
            }else{
                low++;
            }

        }
        for(int x: a)
        System.out.println(x);


    }
}
