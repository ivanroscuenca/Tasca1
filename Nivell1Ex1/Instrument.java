package Nivell1Ex1;

//Instrument es classe abstracta perque té un metode abstracte
public abstract class Instrument {
    //Atributs
    protected String nom;
    protected int preu;

    //Constructor
    public Instrument(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public abstract void tocar(); // metode tocar es abstracte
}
