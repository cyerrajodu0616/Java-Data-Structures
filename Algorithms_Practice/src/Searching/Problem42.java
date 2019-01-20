package Searching;

import java.util.Arrays;

public class Problem42 {

    public static void main(String[] args){

        int[] a = {15,16,19,20,25,1,3,4,5,7,10,14};
        int find_elem = 5;
        using_BF(a,find_elem);
        using_binary(a,find_elem);
        /*Arrays.sort(a);
        System.out.println("using Binary Search :" + binary_search(a,find_elem,0,a.length-1));
        */
    }

    static void using_BF (int[] input,int ele){
        int counter = 0;
        for(int i = 0;i<input.length;i++){
            if( input[i] == ele){
                System.out.println("Required element index: "+ i);
                counter++;
            }

        }

        if(counter == 0)
            System.out.println("Given array dont have required elem: ");

    }

    static void using_binary(int[] input,int find_ele ){
        int input_size = input.length;
        int low = 0;
        int high = input.length-1;
        int mid = (low+high)/2;
        int pivot = input.length;

        while (low < high){
            mid = (low+high)/2;
            if(input[mid-1] > input[mid] && input[mid] < input[mid+1]){
                pivot = mid;
                break;
            }
            else if (input[low] > input[mid]){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Pivot index: "+ pivot);

        if( find_ele == input[pivot]){
            System.out.println("index of required element: "+ pivot);
        }
        else if(find_ele > input[pivot] && find_ele <= input[input.length-1] )
            System.out.println("index of required element: " + binary_search(input,find_ele,pivot+1,input.length-1));
        else
            System.out.println("index of required element: " + binary_search(input,find_ele,0,pivot-1));

    }

    static int binary_search (int[] input, int req_ele,int start,int end){

        int low = start;
        int high = end;
        int mid = 0;
        while(low < high){
            mid = (low + high)/2;
            if (input[mid] == req_ele){
                return mid;
            }
            else if (input[mid] > req_ele){
                high = mid;
            }
            else
                low = mid;
        }
        return -1;

    }

}
