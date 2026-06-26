package Method;

public class ReturnType {
    public static int swati (int a){       //3  a = 9
        System.out.println("kuki");        //4
        if (a>0)  return 5;                //5
        else return 10;                    //6

    }
    public static void main(String[] args) {     //1
        int x = swati(9);                     //2 swati call  after 6 the value is 5
        System.out.println(3+x);                 //7  after 3 +5
    }
}
