package Nivell3;

import java.util.Objects;

public class NoticiaFutbol extends Noticia {
        String competicio,club,jugador;
        public NoticiaFutbol(String titular, String text, int puntuacio, double preu,String competicio, String club,String jugador) {
            super(titular, text, puntuacio, preu);
            this.competicio=competicio;
            this.club=club;
            this.jugador=jugador;
        }

        public int calcularPreuNoticia(String competicio,String club,String jugador) {
            int preu = 300;
            if (Objects.equals(competicio, "LLiga de Campions")){
                preu+=100;
            }
            if ((Objects.equals(club, "Barça")) || (Objects.equals(club, "Madrid"))){
                preu +=100;
            }
            if ((Objects.equals(jugador, "Ferran Torres")) || (Objects.equals(jugador, "Benzema"))){
                preu +=100;
            }

            return preu;
        }

        public int CalcularPuntuacio(String competicio,String club,String jugador){
            int punts=5;
            if (Objects.equals(competicio, "LLiga de Campions")){
                punts+=3;
            }
            if (Objects.equals(competicio, "LLiga")){
                punts+=2;
            }
            if ((Objects.equals(club, "Barça")) || (Objects.equals(club, "Madrid"))){
                punts +=1;
            }
            if ((Objects.equals(jugador, "Ferran Torres")) || (Objects.equals(jugador, "Benzema"))){
                punts +=1;
            }
            return punts;
        }

    }

