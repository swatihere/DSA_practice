package Arrays;

import java.util.ArrayList;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr.get(2));  //to print the value arr[2]
        arr.set(3,6);  //to change the value arr[3]= 6
        System.out.println(arr);

        int n = arr.size();  //arr.length
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");  //second way to print
        }

        for(int ele : arr){
            System.out.print(ele + " ");  //3rd way of printing
        }
        System.out.println();

        arr.add(9);
        System.out.println(arr);
        arr.add(1,10);
        System.out.println(arr);

        arr.remove(arr.size()-1);  //beacuse we add the element otherwise (n-1)
        System.out.println(arr);
    }
}
