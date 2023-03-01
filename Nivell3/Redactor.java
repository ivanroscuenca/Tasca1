package Nivell3;

import java.util.ArrayList;

public class Redactor {

    protected String nom;
    private final String DNI;
    protected int sou;
    public ArrayList<Noticia> noticies;
    public Redactor(String nom, String DNI, double sou){
        this.nom=nom;
        this.DNI=DNI;
        this.sou =1500;
       this.noticies= new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }

    public void setNoticies(ArrayList<Noticia> noticies) {
        this.noticies = noticies;
    }

    public String getDNI() {
        return DNI;
    }

    public void afegirNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public boolean eliminarNoticia(String titular) {
        for (Noticia noticia : noticies) {
            if (noticia.getTitular().equals(titular)) {
                noticies.remove(noticia);
                break;
            }
        }
        return false;
    }

}
