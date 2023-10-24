package org.lessons.java.books;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti libri vuoi inserire? ");
        int nLibri = Integer.parseInt(scan.nextLine());

        Book[] catalogoLibri = new Book[nLibri];

        int indice = 0;

        while (indice < catalogoLibri.length){
            try {
                System.out.println("inserisci i dati del libro: " + (indice + 1));

                System.out.println("Titolo: ");
                String titolo = scan.nextLine();

                System.out.println("Numero pagine: ");
                int numeroPagine = scan.nextInt();
                scan.nextLine();

                System.out.println("autore: ");
                String autore = scan.nextLine();

                System.out.println("Editore: ");
                String editore = scan.nextLine();

                catalogoLibri[indice] = new Book(titolo, numeroPagine, autore, editore);
                indice++;

            }catch (InputMismatchException e) {
                System.out.println("Invalid number");

            }catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido per il numero di pagine!");
            }catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }

        System.out.println("Stampa libri");
        for (Book p : catalogoLibri) {
            System.out.println("\n" + p);
        }


    scan.close();
    }

}
