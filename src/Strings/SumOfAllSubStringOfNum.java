package Strings;

public class SumOfAllSubStringOfNum {
    public static void main(String[] args) {
        String s = "12345";
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j =i ; j< s.length(); j++){
                System.out.print(s.substring(i,j+1)+" ");
                sum += Integer.parseInt(s);  //convert string into int and sum
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }
}
