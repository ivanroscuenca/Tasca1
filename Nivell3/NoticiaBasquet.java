package Nivell3;

import java.util.ArrayList;
import java.util.HashMap;

public class NoticiaBasquet extends Noticia{
    String competicio;
    String club;

    public NoticiaBasquet(String titular, String text,Redactor redactor, String competicio, String club) {
        this.titular = titular;
        this.text = text;
        this.redactor = redactor;

        this.competicio = competicio;
        this.club = club;

        this.price = calcularPreu();
        this.score = calcularPuntuacio();
    }

    @Override
    public int calcularPreu() {
        int initialPrice = 250;
        int totalPrice = initialPrice;
        //Creo un hashmap amb cada parametre y el seu upSell
        HashMap<String, Integer> upSells = new HashMap<>();
        upSells.put("Eurolliga", 75);
        upSells.put("Barça", 75);
        upSells.put("Madrid", 75);

        ArrayList<String> pPrice = new ArrayList<>();
        pPrice.add(competicio);
        pPrice.add(club);

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
        int initialScore = 4;
        int totalScore = initialScore;

        HashMap<String, Integer> upScore = new HashMap<>();
        upScore.put("Eurolliga", 3);
        upScore.put("ACB", 2);
        upScore.put("Barça", 1);
        upScore.put("Madrid", 1);


        ArrayList<String> pScore = new ArrayList<>();
        pScore.add(competicio);
        pScore.add(club);

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