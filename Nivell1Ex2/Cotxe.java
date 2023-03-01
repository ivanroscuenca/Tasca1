package Nivell1Ex2;

public class Cotxe {
    private static final String marca="Sense Marca";
    private static String model;
    private final int potencia ;

    //constructor
    public Cotxe(String marca,String model,int potencia) {
        //this.marca=marca; No es pot inicialitzar al ser final
        this.model=model; // es pot inicialitzar
        this.potencia=potencia; // Es pot inicilitzar

    }

    //metode static es crida sense crear objecte
    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    //metode no static, instanciant i cridant al objecte
    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }
}
