package Recursion;

import java.util.ArrayList;

public class StringBasicMore {
    public static void main(String[] args) {
        String s = "swati";
        change(s);
        System.out.println(s);

        String[] arr = {"swati" , "kuki" , "kavya" , "ishu"};

        ArrayList<String> al =  new ArrayList<>();
        al.add("Swati");
        al.add("Kuki");
        al.add("Ishu");
        al.add("Kavya");
        al.add("Olaf");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    public static void change(String s){
        s = "Kavya"; //String is not Pass By Ref but String array and String Array List is Pass by Ref
    }

    public static void change2(ArrayList<String> al){
        al.add("Doll");  //Pass By Reference

    }
}
