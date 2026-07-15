package Stacks;
import java.util.Stack;

public class NumbersOfVisiblePeopleInStack {
    public int [] canSeePersonCount(int[] arr){
        int n =  arr.length;
        int[] ans = new int[n];

        // Stack stores the heights of people
        Stack<Integer> st = new Stack<>();

        // Push the last person's height
        st.push(arr[n-1]);
        // Last person cannot see anyone
        ans[n-1] = 0;

        for(int i = n-2;i>=0;i--){
            int count = 0 ;     // Count visible people

            while(st.size()>0 && st.peek()<=arr[i]){   // Remove all shorter or equal people
                count++;
                st.pop();
            }
            if(st.size()>0){       // If stack is not empty,
                                       // current person can also see the first taller person
                count++;
            }
            ans[i] = count;
            st.push(arr[i]);          // Push current person's height
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {10, 6, 8, 5, 11, 9};

        NumbersOfVisiblePeopleInStack obj = new NumbersOfVisiblePeopleInStack();

        int[] ans = obj.canSeePersonCount(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
