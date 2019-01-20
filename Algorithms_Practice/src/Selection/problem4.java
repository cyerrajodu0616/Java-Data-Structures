package Selection;

public class problem4 {

    public static void main(String[] args) {
        int[] a = {34, 8, 10, 3, 2, 80, 30, 1, 33};

        int max = -1;
        int second_max = -1;

        for (int i = 0; i < a.length; i++) {

            if(max < Integer.max(max, a[i])) {
                second_max = max;
                max = Integer.max(max, a[i]);
            }


        }
        System.out.println(max + " min: " + second_max);


    }
}
