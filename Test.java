package Activitat2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Matricula> matricules = new ArrayList<>();

        Alumne alumne1 = new Alumne();
        System.out.println("Nom de l'alumne 1: ");
        alumne1.setNom(sc.nextLine());
        System.out.println("Cognoms de l'alumne 1: ");
        alumne1.setCognoms(sc.nextLine());
        System.out.println("Edat de l'alumne 1: ");
        alumne1.setEdat(sc.nextInt());
        sc.nextLine();
        System.out.println("DNI de l'alumne 1: ");
        alumne1.setDni(sc.nextLine());

        Alumne alumne2 = new Alumne();
        System.out.println("Nom de l'alumne 2: ");
        alumne2.setNom(sc.nextLine());
        System.out.println("Cognoms de l'alumne 2: ");
        alumne2.setCognoms(sc.nextLine());
        System.out.println("Edat de l'alumne 2: ");
        alumne2.setEdat(sc.nextInt());
        sc.nextLine();
        System.out.println("DNI de l'alumne 2: ");
        alumne2.setDni(sc.nextLine());

        Modul modul1 = new Modul();
        modul1.setModul("Programació");

        Modul modul2 = new Modul();
        modul2.setModul("Bases de Dades");

        Modul modul3 = new Modul();
        modul3.setModul("Sistemes informatics");

        System.out.println("Quina nota ha tret l'alumne 1 a Programacio?");
        matricules.add(crearMatricula(alumne1, modul1, sc.nextInt()));
        System.out.println("Quina nota ha tret l'alumne 1 a Bases de Dades?");
        matricules.add(crearMatricula(alumne1, modul2, sc.nextInt()));
        System.out.println("Quina nota ha tret l'alumne 1 a Sistemes Informatics?");
        matricules.add(crearMatricula(alumne1, modul3, sc.nextInt()));

        System.out.println("Quina nota ha tret l'alumne 2 a Programacio?");
        matricules.add(crearMatricula(alumne2, modul1, sc.nextInt()));
        System.out.println("Quina nota ha tret l'alumne 2 a Bases de Dades?");
        matricules.add(crearMatricula(alumne2, modul2, sc.nextInt()));
        System.out.println("Quina nota ha tret l'alumne 2 a Sistemes Informatics?");
        matricules.add(crearMatricula(alumne2, modul3, sc.nextInt()));
        sc.nextLine();

        System.out.println("Introdueix el DNI de l'alumne 1 per a veure la mitjana de les seves notes: ");
        extreureNotesMitjana(sc.nextLine(), matricules);
        System.out.println("Introdueix el DNI de l'alumne 1 per a veure els moduls suspesos: ");
        extreuModulsSuspesos(sc.nextLine(), matricules);

        System.out.println();

        System.out.println("Introdueix el DNI de l'alumne 2 per a veure la mitjana de les seves notes: ");
        extreureNotesMitjana(sc.nextLine(), matricules);
        System.out.println("Introdueix el DNI de l'alumne 2 per a veure els moduls suspesos: ");
        extreuModulsSuspesos(sc.nextLine(), matricules);
    }

    public static Matricula crearMatricula(Alumne alumne, Modul modul, double nota) {
        Matricula matricula = new Matricula();
        matricula.getAlumneMatricula().setNom(alumne.getNom());
        matricula.getAlumneMatricula().setCognoms(alumne.getCognoms());
        matricula.getAlumneMatricula().setEdat(alumne.getEdat());
        matricula.getAlumneMatricula().setDni(alumne.getDni());
        matricula.getModulMatricula().setModul(modul.getModul());
        matricula.setNota(nota);
        return matricula;
    }

    public static void extreureNotesMitjana(String dni, ArrayList<Matricula> matricules) {
        double suma = 0;
        int contador = 0;

        for (Matricula m : matricules) {
            if (m.getAlumneMatricula().getDni().equals(dni)) {
                suma += m.getNota();
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("Mitjana de notes (" + dni + "): " + (suma / contador));
        } else {
            System.out.println("No s'ha trobat cap alumne amb DNI " + dni);
        }
    }

    public static void extreuModulsSuspesos(String dni, ArrayList<Matricula> matricules) {
        System.out.println("Mòduls suspesos (" + dni + "):");

        boolean teSuspesos = false;

        for (Matricula m : matricules) {
            if (m.getAlumneMatricula().getDni().equals(dni) && m.getNota() < 5) {
                System.out.println(" - " + m.getModulMatricula().getModul());
                teSuspesos = true;
            }
        }

        if (!teSuspesos) {
            System.out.println(" Cap");
        }
    }
}