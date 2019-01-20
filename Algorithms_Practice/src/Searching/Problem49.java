package Searching;

public class Problem49 {

    public static void main (String[] args){

        int[] a = {1,1,2,2,2,4,5,5,6};
        int find_ele = 1;
        int low = 0;
        int high = a.length-1;

        if(a[0] == find_ele){
            System.out.println("First occurence of element is :" +0);
            System.exit(0);
        }

        while(low < high){
            int mid = (low+high)/2;
            if( a[mid] == find_ele && a[mid-1] != find_ele){
                System.out.println("First occurence of element is :" +mid);
                System.exit(0);
            }
            else if ( a[mid] < find_ele ){
                low = mid;
            }
            else
            {
                high = mid;
            }

        }
        System.out.println("Required element is not there in given array");
    }

}
