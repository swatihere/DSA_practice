package BitManipulation;

public class BitWiseAndOrXor {
    public static void main(String[] args) {
        System.out.println(51&42);  //AND
        System.out.println(51|42);  //OR

        int x = 5;
        System.out.println(~x);    //1's COMPLEMENT
        System.out.println(-x-1);  //1's COMPLEMENT

        System.out.println(~x+1);  //2's COMPLEMENT
        System.out.println(-x);    //2's COMPLEMENT


    }
}
