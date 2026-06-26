package Arrays;

public class PassingArrayToMethods {
    static void main(String[] args) {
        int[] x = {1 , 2 , 3 , 4 , 5};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }

    public static void change (int[] x) {   //reference variable
        x[2]= 6;
    }
}
