package Heap;
import java.util.Arrays;

class Student  implements Comparable<Student>{
    String name ;
    int rno;
    double cgpa;
    Student(String name,int rno,double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s){
        return Integer.compare(this.rno,s.rno);  //inc
                          //(s.rno,this.rno) ---> dec
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Swati" , 114 , 8.1);
        Student s2 = new Student ("Ishita" , 113 , 7.9);
        Student s3 = new Student ("Misha" , 111 , 7.5);
        Student s4 = new Student ("Anu" , 110 , 9.0);
        Student [] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);
        for(Student s: arr){
            System.out.println(s.name+ " "+s.rno+" ");
        }
    }
}
