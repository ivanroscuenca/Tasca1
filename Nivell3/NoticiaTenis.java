package Nivell3;

import java.util.ArrayList;
import java.util.HashMap;

public class NoticiaTenis extends Noticia{
    String competicio;
    static String tenista;

    public NoticiaTenis(String titular, String text,Redactor redactor,String competicio, String tenista) {
        this.titular = titular;
        this.text = text;
        this.redactor = redactor;

        this.competicio = competicio;
        this.tenista = tenista;

        this.price = calcularPreu();
        this.score = calcularPuntuacio();
    }

    @Override
    public int calcularPreu() {
        int initialPrice = 150;
        int totalPrice = initialPrice;
        //Creo un hashmap amb cada parametre y el seu upSell
        HashMap<String, Integer> upSells = new HashMap<>();
        upSells.put("Federer", 75);
        upSells.put("Nadal", 75);
        upSells.put("Djokovic", 75);

        ArrayList<String> pPrice = new ArrayList<>();
        pPrice.add(competicio);
        pPrice.add(tenista);

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
        upScore.put("Federer", 3);
        upScore.put("Nadal", 3);
        upScore.put("Djokovic", 3);



        ArrayList<String> pScore = new ArrayList<>();
        pScore.add(competicio);
        pScore.add(tenista);

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