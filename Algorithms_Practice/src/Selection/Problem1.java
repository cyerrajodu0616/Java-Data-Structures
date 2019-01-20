package Selection;

public class Problem1 {

    public static void main (String[] args){

        int[] a = {34, 8, 10, 3, 2, 80, 30, 1, 33};

        int max =-1;

        for(int x: a){
            max = Integer.max(x,max);
        }

        System.out.println(max);

    }

}
