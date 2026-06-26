package Strings;

public class MostFrequentChar {
    public static void main(String[] args) {
        String s = "banana";

        char[] arr = s.toCharArray();

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = arr[i];
            }
        }

        System.out.println("Most Frequent Character = " + maxChar);
        System.out.println("Frequency = " + maxCount);
    }
}
