package org.lessons.java.books;

public class Book {
    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;

    public Book(String titolo, int numeroPagine, String autore, String editore) {
        this.titolo = setTitolo(titolo);
        this.numeroPagine = setNumeroPagine(numeroPagine);
        this.autore = setAutore(autore);
        this.editore = setEditore(editore);
    }
    @Override
    public String toString() {
        return "Libro: " +
                "Titolo='" + titolo + '\'' +
                ", Numero di Pagine=" + numeroPagine +
                ", Autore='" + autore + '\'' +
                ", Editore='" + editore + '\''
                ;
    }

// SETTER
    public String setTitolo(String titolo) {
        if (titolo != null && !titolo.isEmpty()) {
            this.titolo = titolo;
        } else {
            throw new IllegalArgumentException("il titolo non puo essere vuoto");
        }
        return titolo;
    }

    public int setNumeroPagine(int numeroPagine) {
        if (numeroPagine > 0) {
            this.numeroPagine = numeroPagine;
        } else {
            throw new IllegalArgumentException("il numero di pagine deve essere maggiore di 0");
        }
        return numeroPagine;
    }

    public String setAutore(String autore) {
        if (autore != null && !autore.isEmpty()) {
            this.autore = autore;
        } else {
            throw new IllegalArgumentException("il nome dell'autore non puo essere vuoto");
        }
        return autore;
    }

    public String setEditore(String editore) {
        if (editore != null && !editore.isEmpty()) {
            this.editore = editore;
        } else {
            throw new IllegalArgumentException("il nome dell'editore non puo essere vuoto");
        }
        return editore;
    }



    // GETTER
    public String getTitolo() {
        return titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public String getEditore() {
        return editore;
    }
}
