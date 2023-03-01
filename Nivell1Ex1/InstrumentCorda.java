package Nivell1Ex1;


public class InstrumentCorda extends Instrument {
    public InstrumentCorda(String nom, int preu) {
        super(nom, preu);
    }
    //Procès de carrega de una classe
    static {
        System.out.println("Està sonant un instrument de corda");
    }
    {
        System.out.println("Està sonant un instrument de corda");
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
