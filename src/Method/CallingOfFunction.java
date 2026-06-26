package Method;

public class CallingOfFunction {
    public static void main(String[] args) {    //1
       kavya();                       //2
    }
    public static void swati(){  //6
        ishita();                  //7
        System.out.println("kuki");   //10
    }

    public static void kavya(){ //3
        System.out.println("doll");  //4
        swati();   //5
    }

    public static void ishita(){     //8
        System.out.println("ishu");   //9

    }
}
