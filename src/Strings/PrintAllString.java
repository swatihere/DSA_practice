package Strings;

public class PrintAllString {
    public static void main(String[] args) {
        String s = "swati";
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i; j < s.length() ; j++){
                System.out.print(s.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}
