package OOPS;
class Pokemon{
    int power;
    String name;
    Pokemon(int power, String name){
        this.power = power;
        this.name = name;
    }
    Pokemon(){

    }
    void print(){
        System.out.println(power+" "+name);
    }
}
class LengendaryPokemon extends Pokemon{  //child class
   String ability ;
}
class StrongPokemon extends Pokemon{ //child class
    int speed;
}
class GodPokemon extends LengendaryPokemon{
    char tag;
}

public class Inheritance {
    public static void main(String[] args) {
        LengendaryPokemon mewtwo = new LengendaryPokemon();
        mewtwo.ability = "pressure";
        Pokemon pikachu = new Pokemon();
        pikachu.name = "pikachu";
        mewtwo.print();
        pikachu.print();

    }

}
