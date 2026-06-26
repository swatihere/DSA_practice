package Loops;

public class LoopsBasic {
    static void main(String[] args) {
        for( int n = 1 ; n <=10 ; n++){   //andr int use krne se bahar loop k wo int kaam ni karega
            System.out.println(n);
        }

        int a;
        for(a = 1 ; a<=10 ; a++){
            System.out.println(a);
        }
        System.out.println(a); //ye bhi work karega kyuki a global variable h
    }

}
