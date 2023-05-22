package Nivell3;

import java.util.ArrayList;
import java.util.HashMap;

public class NoticiaMotociclisme extends Noticia{
    static String equip;
    public NoticiaMotociclisme(String titular, String text,Redactor redactor,String equip) {
        this.titular = titular;
        this.text = text;
        this.redactor = redactor;
        this.equip = equip;

        this.price = calcularPreu();
        this.score = calcularPuntuacio();
    }

    @Override
    public int calcularPreu() {
        int initialPrice = 100;
        int totalPrice = initialPrice;
        //Creo un hashmap amb cada parametre y el seu upSell
        HashMap<String, Integer> upSells = new HashMap<>();
        upSells.put("Honda", 50);
        upSells.put("Yamaha", 50);

        ArrayList<String> pPrice = new ArrayList<>();
        pPrice.add(equip);


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
        int initialScore = 3;
        int totalScore = initialScore;

        HashMap<String, Integer> upScore = new HashMap<>();
        upScore.put("Honda", 3);
        upScore.put("Yamaha", 3);




        ArrayList<String> pScore = new ArrayList<>();
        pScore.add(equip);

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


