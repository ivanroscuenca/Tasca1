package Nivell2ex1;

public class Smartphone extends Telefon implements Camera,Rellotge {

    public Smartphone(String num) {
        super(num);
    }
    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto"); ;
    }
    @Override
    public void alarma() {
        System.out.println("està sonant l’alarma");;
    }
}
