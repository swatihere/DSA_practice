package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "latent";
        String str2 = "talent";

        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
        }

        char[] arr1 = str1.toCharArray(); //convert it into arr
        char[] arr2 = str2.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);
       boolean flag = true;

       for(int i=0;i<arr1.length;i++) {
           if (arr1[i] != arr2[i]) {
               flag = false;
               break;
           }
       }
           if(flag){
               System.out.println("is anagram");
           }
           else{
               System.out.println("is not anagram");
           }
    }
}
