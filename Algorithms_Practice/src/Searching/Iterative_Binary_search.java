package Searching;

public class Iterative_Binary_search {

    public static void main (String args[]){

        int a[] = { 1,2,3,4,5,6,7,8,9};
        int ele = 16;
        int low = 0;
        int high = a.length;
        while (low < high)
        {
            int mid = low+(high-low)/2;
            if (ele == a[mid]){
                System.out.println("Found element in array");
                break;
            }
            else
            {
                if (ele < a[mid])
                    high = mid;
                else
                    low = mid+1;
            }
        }

        System.out.println("We did not find element in array");

    }
}
