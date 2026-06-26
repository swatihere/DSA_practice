package basics;

public class TypeCasting {
    static void main(String[] args) {

        char ch = 'A';
        int x  = ch ;   // implicit Typecasting
        System.out.println(x);

        char ch1 = 'a';
        int y = (int)ch1;  //Explicit Typecasting
        System.out.println(y);

        char z = '3';
        System.out.println((int)z);

        char ch2 = 'c';
        System.out.println(ch+0); //we can also do ch*ch or ch+ch

        // Integer to Character

        int s = 99;
        char a = (char)s;
        System.out.println(a);
    }
}
