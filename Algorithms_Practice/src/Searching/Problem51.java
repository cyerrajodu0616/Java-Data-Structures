package Searching;

public class Problem51 {

    public static void main (String[] args){

        int[] a = {1,1,2,2,2,4,5,5,6};
        int find_ele = 2;

        int counter = 0;

        for(int i =0 ;i < a.length; i++){
            if(a[i] == find_ele)
                counter++;
        }

        if (counter != 0)
        System.out.println("no.of occurence of elements: "+ counter);
        else
            System.out.println(" We dont have required ele");
    }

}
