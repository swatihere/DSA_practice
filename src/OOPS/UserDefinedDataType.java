package OOPS;

public class UserDefinedDataType {
    public static class Student { //khud ki ek Data Type "Class"
        String name;
        int age;
        double cgpa;

        void print() {     //Method
            System.out.println(name+" "+age+" "+cgpa);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(); //declarartion
        s1.name = "Swati";
        s1.age = 22;
        s1.cgpa = 8.1;

        Student s2 = new Student();
        s2.name = "Ishita";
        s2.age = 20;
        s2.cgpa = 7.75;

        Student s3 = s1; //s3 is shallow copy of s1 (s3 control s1)

        System.out.println(s1.name+" "+s1.age+" "+s1.cgpa); //Method 1 of Printing
        s2.cgpa = 7.95;
        System.out.println(s2.cgpa);
        System.out.println(s2.age);

        s1.print(); //Method 2 of Printing
    }
}
