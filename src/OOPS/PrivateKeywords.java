package OOPS;

class Students{
    String name; //null
    private int rno = 114; //0 and we do not access the private
    double cgpa; //0.0

//    private void print(){  //Even Function can also be Private, Getter
//        System.out.println(name+" "+rno+" "+cgpa); //Here we can access the Private
//    }
//    public void p(){
//      print();
//    }
}

public class PrivateKeywords {
    public static void main(String[] args) {
        Students s = new Students();
        System.out.println(s.name); //null value show hoga
        s.name = "Swati Srivastava";
        s.cgpa = 9.99;
        System.out.println(s.cgpa);

        //s.print(); //If Print get Private then here it's shows error
        //s.p();

    }
}
