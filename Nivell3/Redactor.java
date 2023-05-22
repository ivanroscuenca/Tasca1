package Nivell3;

import java.util.ArrayList;

public class Redactor {

    protected String nom;
    protected String dni;
    protected int sou;
    public static ArrayList<Noticia> noticies;
    public Redactor(String nom, String dni, double sou){
        this.nom=nom;
        this.dni=dni;
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

    public void printNoticiesList(){
        for (int i = 0; i<noticies.size();i++){
            System.out.println(noticies.get(i));
        }
    }

    public String getDNI() {
        return dni;
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
