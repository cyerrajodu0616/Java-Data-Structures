package Selection;

public class problem3 {

    public static void main(String[] args) {
        int[] a = {34, 8, 10, 3, 2, 80, 30, 1, 33};

        int max = -1;
        int min = 10000000;

        for (int i = 0; i < a.length-1;i++){

            if(a[i] > a[i+1]){
                max = Integer.max(max,a[i]);
                min = Integer.min(min,a[i+1]);
            }
            else{
                max = Integer.max(max,a[i+1]);
                min = Integer.min(min,a[i]);
            }

        }

        System.out.println(max+ " min: " + min);

    }
}
