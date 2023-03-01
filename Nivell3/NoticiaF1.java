package Nivell3;

import java.util.Objects;

public class NoticiaF1 extends Noticia{
    String escuderia;

    public NoticiaF1(String titular, String text, int puntuacio, double preu, String escuderia) {
        super(titular, text, puntuacio, preu);
        this.escuderia = escuderia;
    }

    public int calcularPreuNoticia(String escuderia) {
        int preu = 100;

        if ((Objects.equals(escuderia, "Ferrari")) || (Objects.equals(escuderia, "Mercedes"))){
            preu +=50;
        }
        return preu;
    }
    public int CalcularPuntuacio(String escuderia){
        int punts=4;
        if ((Objects.equals(escuderia, "Ferrari")) || (Objects.equals(escuderia, "Mercedes"))){
            punts +=2;
        }

        return punts;
    }
}