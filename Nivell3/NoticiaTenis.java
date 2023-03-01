package Nivell3;

import java.util.Objects;

public class NoticiaTenis extends Noticia {
    String competicio,tenista;

    public NoticiaTenis(String titular, String text, int puntuacio, double preu, String competicio, String tenista) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.tenista = tenista;
    }

    public int calcularPreuNoticia(String tenista) {
        int preu = 150;

        if ((Objects.equals(tenista, "Federer")) || (Objects.equals(tenista, "Nadal")) || (Objects.equals(tenista, "Djokovic"))){
            preu +=100;
        }
        return preu;
    }
    public int CalcularPuntuacio(String tenista){
        int punts=4;

        if ((Objects.equals(tenista, "Federer")) || (Objects.equals(tenista, "Nadal")) || (Objects.equals(tenista, "Djokovic"))){
            punts +=3;
        }
        return punts;
    }
}
