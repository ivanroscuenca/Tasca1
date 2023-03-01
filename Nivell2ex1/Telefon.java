package Nivell2ex1;

public class Telefon {
private String marca;
private String model;
private String num;

//Constructor
    public Telefon(String num){
    this.num=num;
    }
    //metode getter - Return
    public void trucar() {
        System.out.println("S’està trucant al número: " + num);
    }
}



