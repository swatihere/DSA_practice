package OOPS;

public class PassingClassesToMethod {
    public static class Car{  //BluePrint
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
        }
    }
    public static void main (String[] args){
        Car c = new Car();  //Object ---> actual car built from blueprint

        c.length = 3.99;  //c---> Name and Tag given to the car
        c.name = "Audi";
        c.seats = 4;
        c.torque = 178;
        c.type = "SUV";

        change (c);
        System.out.println(c.seats);
        c.print();

    }
    private static void change (Car c){
        c.seats = 4;

    }
}
