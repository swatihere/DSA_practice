package OOPS;

class ComplexNumbers{
    int x;
    int y ;
    ComplexNumbers(int x , int y){
      this.x = x;
      this.y = y;
    }
    void print(){
       if(y>=0) System.out.println(x+" + "+y+"i");
       else System.out.println(x+" - "+(-y)+"i");
    }
    void add(ComplexNumbers z){
        x += z.x;
        y += z.y;
    }
    void multiply(ComplexNumbers z){
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }
}

public class ComplexNum {
    public static void main(String[] args) {
        ComplexNumbers z1 = new ComplexNumbers(1,-2);
        ComplexNumbers z2 = new ComplexNumbers(3,4);
        z1.print();
        z2.print();

        z1.add(z2);
        z1.print();

        z2.multiply(z1);
        z2.print();

    }
}
