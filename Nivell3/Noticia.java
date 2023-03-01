package Nivell3;
public class Noticia {

    private String titular;
    private String text;
    private int puntuacio;
    private double preu;

    public Noticia(String titular, String text, int puntuacio, double preu) {
        this.titular = titular;
        this.text = text;
        this.puntuacio = puntuacio;
        this.preu = preu;
    }



    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntuacio='" + puntuacio + '\'' +
                ", preu=" + preu +
                '}';
    }
}
