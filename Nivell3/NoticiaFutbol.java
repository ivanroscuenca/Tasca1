package Nivell3;

import java.util.ArrayList;
import java.util.HashMap;

public class NoticiaFutbol extends Noticia{
    static String competicio;
    static String club;
    static String jugador;

    public NoticiaFutbol(String titular, String text,Redactor redactor,String competicio, String club, String jugador) {
        this.titular = titular;
        this.text = text;
        this.redactor = redactor;

        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;

        this.price = calcularPreu();
        this.score = calcularPuntuacio();
    }

    @Override
    public int calcularPreu() {
        int initialPrice = 300;
        int totalPrice = initialPrice;

        //Creo un hashmap amb cada parametre y el seu upSell
        HashMap<String, Integer> upSells = new HashMap<>();
        upSells.put("Lliga de Campions", 100);
        upSells.put("Barça", 100);
        upSells.put("Madrid", 100);
        upSells.put("Ferran Torres", 50);
        upSells.put("Benzema", 50);

        ArrayList<String> pPrice = new ArrayList<>();
        pPrice.add(competicio);
        pPrice.add(club);
        pPrice.add(jugador);

        //Comparo els parametres amb els upSells y si coincideixen sumo el preu
        for (String p : pPrice) {
            for (String k : upSells.keySet()) {
                if (k.equals(p)) {
                    totalPrice = totalPrice + upSells.get(k);
                }
            }
        }
        return totalPrice;
    }

    @Override
    public int calcularPuntuacio() {
        int initialScore = 5;
        int totalScore = initialScore;

        HashMap<String, Integer> upScore = new HashMap<>();
        upScore.put("Lliga de campions", 3);
        upScore.put("Lliga", 2);
        upScore.put("Barça", 1);
        upScore.put("Madrid", 1);
        upScore.put("Ferran Torres", 1);
        upScore.put("Benzema", 1);

        ArrayList<String> pScore = new ArrayList<>();
        pScore.add(competicio);
        pScore.add(club);
        pScore.add(jugador);

        for (String p : pScore) {
            for (String k : upScore.keySet()) {
                if (p.equals(k)) {
                    totalScore = totalScore + upScore.get(k);
                }
            }
        }
        return totalScore;
    }
}