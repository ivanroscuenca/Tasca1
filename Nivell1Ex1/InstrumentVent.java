package Nivell1Ex1;

public class InstrumentVent extends Instrument {
    public InstrumentVent(String nom, int preu) {
        //Super invocar metodes i atributs superiors de la clase principal
        super(nom, preu);
    }

    //metode tocar de isntrument de vent
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}