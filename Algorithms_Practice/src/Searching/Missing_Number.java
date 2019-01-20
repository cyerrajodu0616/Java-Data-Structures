package Searching;

public class Missing_Number {

    public static void main(String args[]){

        int a[] = {1,2,4,6,3,7,8};

        int number_elements = a.length+1;
        int total_sum = number_elements * (number_elements+1)/2;
        int sum = 0;

        for(int x:a){
            sum = sum+x;
        }

        int missing_element = total_sum-sum;
        System.out.println("Missing element in given array: "+ missing_element);


    }
}
