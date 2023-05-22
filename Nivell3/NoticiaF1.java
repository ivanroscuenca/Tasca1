package Nivell3;


import java.util.ArrayList;
import java.util.HashMap;

public class NoticiaF1 extends Noticia{
    static String escuderia;
    public NoticiaF1(String titular, String text,Redactor redactor,String escuderia) {
        this.titular = titular;
        this.text = text;
        this.redactor = redactor;

        this.escuderia = escuderia;

        this.price = calcularPreu();
        this.score = calcularPuntuacio();
    }

    @Override
    public int calcularPreu() {
        int initialPrice = 100;
        int totalPrice = initialPrice;

        //Creo un hashmap amb cada parametre y el seu upSell
        HashMap<String, Integer> upSells = new HashMap<>();
        upSells.put("Ferrari", 50);
        upSells.put("Mercedes", 50);

        ArrayList<String> pPrice = new ArrayList<>();
        pPrice.add(escuderia);

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
        upScore.put("Ferrari", 2);
        upScore.put("Mercedes", 2);




        ArrayList<String> pScore = new ArrayList<>();
        pScore.add(escuderia);

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