package Selection;

public class problem2 {

    public static void main (String[] args){

        int[] a = {34, 8, 10, 3, 2, 80, 30, 1, 33};

        int max =-1;
        int min = 10000000;

        for(int x: a){
            max = Integer.max(x,max);
            min = Integer.min(x,min);
        }

        System.out.println("Maximum: " +max);
        System.out.println("Minimum: " +min);

    }

}
