package Searching;

public class Problem52 {

    public static void main(String[] args){
        int[] a = {1,1,2,2,2,4,5,5,6};
        int find_ele = 2;
        int low =0;
        int high = a.length-1;
        int counter = 0;
        int first_occurence = -1;
        int last_occurence = -1;



        while (low < high){

            if(a[0] == find_ele) {
                first_occurence = 0;
                break;
            }

            int mid = (low+high)/2;

            if(a[mid] == find_ele && a[mid-1] != find_ele){
                first_occurence = mid;
                break;
            }
            else if(a[mid] < find_ele){
                low = mid;
            }
            else
                high = mid;
        }

        if( first_occurence == -1)
        {
            System.out.println("Array dont have required element");
            System.exit(0);
        }

        for(int i = first_occurence; i < a.length-1;i++)
        {
            if(a[i] == find_ele){
                counter++;
            }
            else
            {
                break;
            }
        }

          System.out.println("No.of appearaence of give element :" + counter);


    }

}
