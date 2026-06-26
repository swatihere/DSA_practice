package Arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] a = {3, 5, 8, 10, 11 , 13};
        int[] b = {2, 4, 9, 12, 15 , 16 , 17};

        int[] c = new int[a.length + b.length];
        for (int ele : c) {
            System.out.print(ele+" ");
        }
        System.out.println();
        merge(c, a, b);
        for (int ele : c) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else
                c[k++] = b[j++];

        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
}
