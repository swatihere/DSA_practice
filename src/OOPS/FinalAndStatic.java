package OOPS;

public class FinalAndStatic {
   static class BTSMem{

        static String groupname = "BTS"; //Static variable shared by all members
        final String name; //Final varable it cannot be changed
        int age; //Normal variable

        BTSMem(String name, int age) { //Constructor
            this.name = name;
            this.age = age;
        }
        void print(){
            System.out.println(groupname+" "+name+" "+age);
        }
    }
    public static void main(String[] args) {
        BTSMem m1 = new BTSMem("RM", 31);
        BTSMem m2 = new BTSMem("Jungkook", 28);

        m1.print();
        m2.print();



    }
}
