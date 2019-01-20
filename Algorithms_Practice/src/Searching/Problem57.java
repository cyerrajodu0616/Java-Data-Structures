package Searching;

import javax.swing.*;
import java.util.Arrays;

public class Problem57 {

    public static void main(String[] args) {

        //int[] a = {1,4,1,2,3,1,1};
        //int[] a = {1,4,2,3,2,2,2};

        int[] a = {1,1,1,1,1,2,3,4};

        Arrays.sort(a);

        int find_ele;
        int low = 0;
        int high = a.length - 1;
        int counter = 0;
        int first_occurence = -1;
        int last_occurence = -1;

        int total_appearance = 0;

        int mid = (low+high)/2;

        find_ele = a[mid];

        if(a[high] == find_ele){
            last_occurence = high;
        }

        if (a[0] == find_ele) {
            first_occurence = 0;
        }

        if( first_occurence == -1) {
            while (low < high) {
                mid = (low + high) / 2;

                if (a[mid] == find_ele && a[mid - 1] != find_ele) {
                    first_occurence = mid;
                    break;
                } else if (a[mid] < find_ele) {
                    low = mid;
                } else
                    high = mid;

            }
        }


        if(last_occurence == -1) {
            low = 0;
            high = a.length-1;
            while (low < high) {

                mid = (low + high) / 2;

                if (a[mid] == find_ele && a[mid + 1] != find_ele) {
                    last_occurence = mid;
                    break;
                } else if (a[mid] <= find_ele) {
                    low = mid;
                } else
                    high = mid;

            }
        }
            //System.out.println("first: " + first_occurence);
            //System.out.println("Last: " + last_occurence);

            total_appearance = last_occurence-first_occurence+1;
            //System.out.println("Total No of occurence :" + total_appearance);



        if(total_appearance > a.length/2){
            System.out.println("maximum appearance elem: "+ a[a.length/2]);
        }
        else
            System.out.println("No element");

    }

}
