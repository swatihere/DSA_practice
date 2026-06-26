package Sorting;

import java.util.Arrays;

public class CommonElement {
public static void main (String[] args) {
    int[] a = {4, 2, 1, 3, 5, 6, 7, 8};
    int[] b = {3, 4, 5, 6, 7, 9, 8, 10};
    Arrays.sort(a);
    Arrays.sort(b);
    int i=0 ;
    int j=0 ;

    while(i<a.length && j<b.length){
        if(a[i]==b[j]){
            System.out.print(a[i] + " " + b[j]+" ");
            i++;
            j++;
        }
        else if(a[i]<b[i]){
            i++;
        }
        else{
            j++;
        }
    }
}

}