package Nivell1Ex1;

public class InstrumentPercussio extends Instrument {
    public InstrumentPercussio(String nom, int preu) {
        super(nom, preu);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }

}
