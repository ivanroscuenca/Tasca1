
package Nivell3;

import java.util.Objects;

public class NoticiaBasquet extends Noticia {
    String competicio,club,jugador;


    public NoticiaBasquet(String titular, String text, int puntuacio, double preu, String competicio, String club, String jugador) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    public NoticiaBasquet(String titular, String text, int puntuacio, double preu) {
        super(titular, text, puntuacio, preu);

    }

    public int calcularPreuNoticia(String competicio,String club,String jugador) {
        int preu = 250;
        if (Objects.equals(competicio, "Eurolliga")){
            preu+=75;
        }
        if ((Objects.equals(club, "Barça")) || (Objects.equals(club, "Madrid"))){
            preu +=75;
        }
        return preu;
    }

    public int CalcularPuntuacio(String competicio,String club,String jugador){
        int punts=4;
        if (Objects.equals(competicio, "Eurolliga")){
            punts+=3;
        }
        if (Objects.equals(competicio, "ACB")){
            punts+=2;
        }
        if ((Objects.equals(club, "Barça")) || (Objects.equals(club, "Madrid"))){
            punts +=1;
        }
        return punts;
    }

}