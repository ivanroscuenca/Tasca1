package Nivell1Ex1;
//Nivell 1
//        - Exercici 1
//        En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.
//
//        Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat tocar().
//        Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles.
//        Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent"
//        , si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument
//        de percussió: “Està sonant un instrument de percussió”.
//
//
//        El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per la
//        creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.
//
//        Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.

public class Main {
    public static void main(String[] args) {
        InstrumentVent instrument1 = new InstrumentVent("trompeta", 100);
        instrument1.tocar();

        InstrumentCorda instrument2 = new InstrumentCorda("guitarra", 200);

        InstrumentPercussio instrument3 = new InstrumentPercussio("tambor", 50);
        instrument3.tocar();

    }
}








