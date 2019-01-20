package Searching;

public class problem53 {

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 2, 2, 4, 5, 5, 6};
        int find_ele = 4;
        int low = 0;
        int high = a.length - 1;
        int counter = 0;
        int first_occurence = -1;
        int last_occurence = -1;

        int total_appearance = 0;

        if(a[high] == find_ele){
            last_occurence = high;
        }

        if (a[0] == find_ele) {
            first_occurence = 0;
        }

        if(last_occurence + first_occurence == -2){

            while (low < high) {
                int mid = (low + high) / 2;

                if (a[mid] == find_ele && a[mid - 1] != find_ele) {
                    first_occurence = mid;
                    break;
                } else if (a[mid] < find_ele) {
                    low = mid;
                } else
                    high = mid;

            }

            while (low < high) {
                int mid = (low + high) / 2;

                if (a[mid] == find_ele && a[mid + 1] != find_ele) {
                    last_occurence = mid;
                    break;
                } else if (a[mid] <= find_ele) {
                    low = mid;
                } else
                    high = mid;

            }

            System.out.println("first: " + first_occurence);
            System.out.println("Last: " + last_occurence);

            total_appearance = last_occurence-first_occurence+1;
            System.out.println("Total No of occurence :" + total_appearance);

        }
        else if (last_occurence == -1 || first_occurence == -1 ) {
            System.out.println("Total No of occurence :" + 1);
        }
        else{

            System.out.println("Dont have number :");
        }
    }
}