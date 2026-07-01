package OOPS;


class Student {
    String name;      // default value = null
    private int rno ;
    double cgpa;      // default value = 0.0

    public void print() {
        System.out.println(name + " " + rno + " " + cgpa);
    }
    int getRno() { //Getter  (we use getter and setter for the private value)
        return rno;
    }
    void setRno(int x){  //Setter (and this method is called Encapsulation)
        rno = x;
    }
}

public class GetterSetter {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name); // null

        s.name = "Swati Srivastava";
        s.cgpa = 9.99;

        System.out.println(s.cgpa);

        s.print();
        s.setRno(12);
        System.out.println(s.getRno());
    }
}
