package Searching;

public class Unordered_Linear_Search {


    public static Boolean get_element(int[] input_array, int ele) {
        System.out.println("Searching for element");
        Boolean ret = false;
        for (int x : input_array) {
            if (x == ele) {
                ret = true;
                break;
            }
            else
                ret = false;

        }
        return ret;
    }

    public static void main(String args[]) {

        int[] a = {1, 2, 3, 4, 5, 6};
        int ele1 = 6;

        System.out.println(get_element(a, 10).toString());
        System.out.println(get_element(a, 3).toString());


    }
}
