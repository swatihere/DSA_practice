package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Swati");
        System.out.println(s.length());

        s.append("Srivastava");
        System.out.println(s);

        s.setCharAt(0,'P');
        System.out.println(s);

        //String t = s.toString(); //to convert into string
        //System.out.println(t);

        //s.reverse();
        //System.out.println(s);

        //2nd method to reverse string
        int i = 0;
        int j = s.length() - 1;

        while(i<=j){
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);
            s.setCharAt(i,temp2);
            s.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(s);


    }
}
