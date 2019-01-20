package Searching;

public class Finding_Element_Using_Binary_Search_Tree {


    public static void main(String[] args){

        String key = "TG:38570:LHO";

        for(String x: key.split(":",2))
            System.out.println(x);

        String[] keyparts = key.split(":",2);

        System.out.println(String.format("%s\002%s\002%2.3f",keyparts[0],(keyparts.length > 1)?keyparts[1]:"",0.1));



    }
}
