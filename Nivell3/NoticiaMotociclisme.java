package Nivell3;

import java.util.Objects;

public class NoticiaMotociclisme extends Noticia {
    String equip;

    public NoticiaMotociclisme(String titular, String text, int puntuacio, double preu, String equip) {
        super(titular, text, puntuacio, preu);
        this.equip = equip;
    }

    public int calcularPreuNoticia(String equip) {
        int preu = 100;

        if ((Objects.equals(equip, "Honda")) || (Objects.equals(equip, "Yamaha"))){
            preu +=50;
        }
        return preu;
    }

    public int CalcularPuntuacio(String equip){
        int punts=3;
        if ((Objects.equals(equip, "Honda")) || (Objects.equals(equip, "Yamaha"))){
            punts +=3;
        }

        return punts;
    }
}