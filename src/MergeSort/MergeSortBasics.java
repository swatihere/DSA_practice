package MergeSort;

public class MergeSortBasics {
    public static void main(String[] args) {
        int[] arr={9,4,1,5,2,7,3,0,6};
        mergeSort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
    //Divide and conquer
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //step 1
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        //Step2
        int idx = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            a[i] = arr[idx];
            idx++;
        }
        for(int i = 0 ; i < b.length ; i++){
            b[i] = arr[idx];
            idx++;
        }
        //step3
        mergeSort(a);
        mergeSort(b);

        //step 4
        merge(a,b,arr);
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i = 0 ;
        int j = 0 ;
        int k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else {
                c[k] = b[j];
                k++;
                j++;
            }

        }
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
    }
}
