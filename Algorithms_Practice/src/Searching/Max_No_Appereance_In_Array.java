package Searching;

public class Max_No_Appereance_In_Array {

    public static void main(String args[]){

        int a[] = {1,2,3,4,5,6,7,8,3,4,5,3,4,3,3};
        int maxi = 0;

        for(int i=0;i<a.length;i++){
            int counter =0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] == a[j]){
                    counter++;
                }

            }
         if(maxi < counter){
                maxi= counter;
         }

        }
        maxi++;

System.out.println("Maximum Number of integer appearance :" + maxi);
    }

}
