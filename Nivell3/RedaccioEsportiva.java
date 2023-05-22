package Nivell3;

import java.util.*;

import static Nivell3.NoticiaF1.escuderia;
import static Nivell3.NoticiaFutbol.*;
import static Nivell3.NoticiaMotociclisme.equip;
import static Nivell3.NoticiaTenis.tenista;
import static Nivell3.Redactor.noticies;

public class RedaccioEsportiva {
    static ArrayList<Redactor> redactors = new ArrayList<>();
    public static void intro(){

        Scanner sc = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("Menú:");
            System.out.println("1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia.");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("0.- Sortir.");
            System.out.print("Introdueix una opció: ");
            opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {
                case 1 -> {
                    Redactor nouRedactor = introduirRedactor(sc);
                    if (nouRedactor != null) {
                        redactors.add(nouRedactor);
                    }
                }
                case 2 -> eliminarRedactor(sc, redactors);
                case 3 -> introduirNoticia();
                case 4 -> eliminarNoticia();
                case 5 -> mostrarNoticies();
                case 6 -> calcularPuntuacioNoticia();
                case 7 -> calcularPreuNoticia();
                case 0 -> System.out.println("Programa finalitzat.");
                default -> System.out.println("Opció incorrecta. Torna-ho a intentar.");
            }
        } while (opcio != 0);
    }


    //Case 1
    public static Redactor introduirRedactor(Scanner sc) {
        System.out.print("Introdueix el nom del redactor: ");
        String nom = sc.nextLine();
        System.out.print("Introdueix el DNI del redactor: ");
        String dni = sc.nextLine();
        System.out.print("Introdueix el sou del redactor: ");
        double sou = sc.nextDouble();
        sc.nextLine();
        for (Redactor redactor : redactors) {
            if (dni.equals(redactor.getDNI())) {
                System.out.println("Ja existeix un redactor amb aquest DNI.");
                return null;
            }
        }
        Redactor nouRedactor = new Redactor(nom, dni, sou);
        System.out.println("Redactor afegit correctament.");
        return nouRedactor;
    }

    //Case 2
    public static void eliminarRedactor(Scanner sc, ArrayList<Redactor> redactors) {
        System.out.print("Introdueix el DNI del redactor a eliminar: ");
        String dni = sc.nextLine();
        boolean eliminat = false;
        for (int i = 0; i < redactors.size(); i++) {
            if (dni.equals(redactors.get(i).getDNI())) {
                redactors.remove(i);
                eliminat = true;
                System.out.println("Redactor eliminat correctament.");
                break;
            }
        }
        if (!eliminat) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
        }
    }


    //Case 3
    public static void introduirNoticia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el DNI del redactor: ");
        String dni = sc.nextLine();
        Redactor redactor = null;
        for (Redactor r : redactors) {
            if (dni.equals(r.getDNI())) {
                redactor = r;
                break;
            }
        }
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
            return;
        }
        System.out.println("\n \n \n");
        System.out.println("Introduzca titular");
        String titular = sc.nextLine();

        System.out.println("\n \n \n");
        System.out.println("Introduzca texto");
        String text = sc.nextLine();

        System.out.println("\n \n \n");
        System.out.println("Elija el tipo de noticia:");
        System.out.println("1.-Noticia de Futbol");
        System.out.println("2.-Noticia de Basquet");
        System.out.println("3.-Noticia de Tenis");
        System.out.println("4.-Noticia de F1");
        System.out.println("5.-Noticia de Motociclismo");

        int tipus = sc.nextInt();

        switch (tipus) {
            case 1:
                //Case Noticia Futbol
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Futbol: String competicio, String club, String jugador
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Introdueix la competicio:");
                competicio = sc1.nextLine();

                System.out.println("Introdueix el club:");
                club = sc1.nextLine();

                System.out.println("Introdueix el jugador:");
                jugador = sc1.nextLine();

                NoticiaFutbol noticiaF = new NoticiaFutbol(titular,text,redactor,competicio,club,jugador);
                noticies.add(noticiaF);
                break;
            case 2:
                //Case Noticia Basquet
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Basquet: String competicio, String club
                Scanner sc2 = new Scanner(System.in);

                System.out.println("Introdueix la competicio");
                competicio = sc2.nextLine();

                System.out.println("Introdueix el club");
                club = sc2.nextLine();

                NoticiaBasquet noticiaB = new NoticiaBasquet(titular, text, redactor, competicio, club);
                noticies.add(noticiaB);
                break;
            case 3:
                //Case Noticia Tenis
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Tenis: String competicio, String tenista
                Scanner sc3 = new Scanner(System.in);

                System.out.println("Introdueix la competicio");
                competicio = sc3.nextLine();

                System.out.println("Introdueix el tenista");
                tenista = sc3.nextLine();

                NoticiaTenis noticiaT = new NoticiaTenis(titular, text, redactor, competicio, tenista);
                noticies.add(noticiaT);
                break;
            case 4:
                //Case Noticia F1
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros F1: String escuderia

                Scanner sc4 = new Scanner(System.in);

                System.out.println("Introdueix l'escuderia");
                escuderia = sc4.nextLine();

                NoticiaF1 noticia1F = new NoticiaF1(titular, text, redactor, escuderia);
                noticies.add(noticia1F);
                break;
            case 5:
                //Case Motociclisme
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Motociclisme: String equip

                Scanner sc5 = new Scanner(System.in);

                System.out.println("Introdueix l'equip:");
                equip = sc5.nextLine();

                NoticiaMotociclisme noticiaM = new NoticiaMotociclisme(titular, text, redactor,equip);
                noticies.add(noticiaM);
                break;

        }
        System.out.println("Se ha introducido una noticia");
    }
    

    //case 4

    public static void eliminarNoticia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el DNI del redactor: ");
        String dni = sc.nextLine();
        Redactor redactor = null;
        for (Redactor r : redactors) {
            if (dni.equals(r.getDNI())) {
                redactor = r;
                break;
            }
        }
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
            return;
        }
        System.out.print("Introdueix el titular a eliminar");
        String titular = sc.nextLine();
        sc.nextLine();
        redactor.eliminarNoticia(titular);
        System.out.println("Notícia Eliminada");
    }

    //case 5
    public static void mostrarNoticies() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Noticia> noticiesRedactor = new ArrayList<>();
        Redactor redactor = null;

        System.out.println("Introdueix el Dni del redactor de les noticies a mostrar \n");
        String dni = sc.nextLine();
        for (Redactor r : redactors) {
            if (r.dni.equals(dni)) {
                redactor = r;
            }
        }
        if (redactor == null) {
            System.out.println("No s'ha trobat el redactor \n");
            return;
        }

        for (Noticia n : noticies) {
            if (n.getRedactor().equals(redactor)){
                noticiesRedactor.add(n);
            }
        }

        for (Noticia nr : noticiesRedactor) {
            System.out.println();
            System.out.printf("%s por %s \n", nr.getTitular(), nr.getRedactor().getNom());
            System.out.println();
            System.out.println("   ################################   ");
        }

    }

    //case 6
    public static void calcularPreuNoticia() {
        Scanner sc = new Scanner(System.in);
        Redactor redactor = null;
        Noticia noticia = null;

        System.out.println("DNI del Redactor de la noticia calcular Preu \n");
        String dni = sc.nextLine();
        for (Redactor r : redactors) {
            if (r.dni.equals(dni)) {
                redactor = r;
            }
        }
        if (redactor == null) {
            System.out.println("Redactor no trobat");
            return;
        }

        System.out.println("Titular de la noticia a calcular Preu: \n");
        String titular = sc.nextLine();
        for (Noticia n : noticies) {
            if (n.getTitular().equals(titular) && n.getRedactor().equals(redactor)) {
                noticia = n;
            }
        }
        if (noticia == null) {
            System.out.println("Noticia no trobada");
            return;
        }

        System.out.printf("El preu de la noticia es: %s \n", noticia.calcularPreu());
        System.out.println();
    }
    //case 7
    public static void calcularPuntuacioNoticia() {
        Scanner sc = new Scanner(System.in);
        Redactor redactor = null;
        Noticia noticia = null;

        System.out.println("DNI del Redactor de la noticia calcular Score \n");
        String dni = sc.nextLine();
        for (Redactor r : redactors) {
            if (r.dni.equals(dni)) {
                redactor = r;
            }
        }
        if (redactor == null) {
            System.out.println("Redactor no trobat");
            return;
        }

        System.out.println("Titular de la noticia a calcular Score: \n");
        String titular = sc.nextLine();
        for (Noticia n : noticies) {
            if (n.getTitular().equals(titular) && n.getRedactor().equals(redactor)) {
                noticia = n;
            }
        }
        if (noticia == null) {
            System.out.println("Noticia no trobada");
            return;
        }

        System.out.printf("La score de la noticia es: %s", noticia.getScore());
        System.out.println();
    }

}
