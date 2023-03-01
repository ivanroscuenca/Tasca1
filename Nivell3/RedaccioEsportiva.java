package Nivell3;

import java.util.*;

public class RedaccioEsportiva {
    static ArrayList<Redactor> redactors = new ArrayList<>();
    public static void main(String[] args) {
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
        System.out.print("Introdueix el títol de la notícia: ");
        String titular = sc.nextLine();
        System.out.print("Introdueix el cos de la notícia: ");
        String text = sc.nextLine();
        System.out.print("Introdueix la puntuació: ");
        int puntuacio = sc.nextInt();
        System.out.print("Introdueix el preu: ");
        double preu= sc.nextDouble();
        sc.nextLine();
        Noticia novaNoticia = new Noticia(titular,text,puntuacio,preu);
        redactor.afegirNoticia(novaNoticia);
        System.out.println("Notícia afegida correctament.");
    }

    //case 4

    private static void eliminarNoticia() {
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
    private static void mostrarNoticies() {
    }

    //case 6
    private static void calcularPreuNoticia() {

    }
    //case 7
    private static void calcularPuntuacioNoticia() {
    }




}
