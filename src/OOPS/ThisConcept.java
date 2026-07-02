package OOPS;

public class ThisConcept {
    private static class BTS{
        String name;
        int age;

        BTS(String name,int age){
            this.name=name;
            this.age=age;
        }
        void print(){
            System.out.println(name+" "+age);
        }
    }
    public static void main(String[] args) {
        BTS m1 = new BTS("kim Taehyung", 27);
        BTS m2 = new BTS("Park Jimin", 26);
        m1.print();
        m2.print();
    }
}
