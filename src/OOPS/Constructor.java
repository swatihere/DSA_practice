package OOPS;

public class Constructor {

    public static class Car{
        String name; //default value null
        int seats; //default value 0
        double length; //default value 0.0
        Car(){  //Default Constructor

        }

        Car(int x , String s , double d){  //So we can add the value in the function or method
            name = s;
            seats = x;
            length = d;
        }

        Car(String s ,int x){
            name = s;
            seats = x;
        }
        void print(){
            System.out.println(name+" "+seats+" "+length);
        }
    }

    public static void main (String[] args){

        Car c1=new Car(1,"BMW",1200);
        c1.print();
        c1.length=1300; //modification

        Car c2=new Car(2,"AUDI",1400); //Call 2nd Constructor
        c2.print();

        Car c3=new Car(); //We can also initailize like this due to default constructor
        c3.name= "mercedes";

        Car  c4=new Car("Alto",4); //Call 3rd Constructor
        c4.print();

    }

}
