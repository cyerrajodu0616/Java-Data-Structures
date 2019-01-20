package Searching;

public class Problem70_Better_Sol {

    public static void main (String[] args){

        int[] a = {12,34,45,9,8,90,3};

        int low = 0;
        int high = a.length-1;
        int temp = -1;

        while (low < high){

            if(a[low]%2 != 0 ){
                if(a[high]%2 == 0)
                {
                    temp = a[low];
                    a[low] = a[high];
                    a[high] = temp;
                    low++;
                    high--;
                }
                else{
                    high--;
                }
            }else {
                low++;
            }


        }

        for(int x: a)
        System.out.println(x);

    }

}
