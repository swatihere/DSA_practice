package Strings;

public class NonRepeatingchar {
        public static void main(String[] args) {

            String s = "swiss";

            char[] arr = s.toCharArray();

            for (int i = 0; i < arr.length; i++) {

                int count = 0;

                for (int j = 0; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.println("First Non-Repeating Character = " + arr[i]);
                    break;
                }
            }
        }
}
