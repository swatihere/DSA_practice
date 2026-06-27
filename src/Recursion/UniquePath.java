package Recursion;

public class UniquePath {
//        public static int uniquePaths(int m, int n){
//            if(m==1 || n==1) return 1;
//            return uniquePaths(m-1,n) + uniquePaths(m,n-1);
//        }
//        public static void main (String[] args){
//            int m = 5;
//            int n = 5;
//            System.out.println(uniquePaths(m,n));
//        }

    //2nd method
    public static int paths(int cr, int cc , int lr , int lc ){  //currentrow lastrow
        if(cr==lr && cc==lc){
            return 1;
        }
        if(cr>lr || cc>lc){
            return 0;
        }
        int right = paths(cr , cc+1 , lr , lc);
        int down = paths(cr+1 , cc , lr , lc);
        return right+down;

    }
    public static void main (String[] args){
        int rows = 4;
        int cols = 5;
        System.out.println(paths(0, 0, rows-1, cols-1));
    }

}
