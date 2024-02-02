package traccia4;

public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private boolean disponibilita;

    public Libro(String titolo, String autore, String genere, boolean disponibilita) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.disponibilita = disponibilita;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean isDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }

    @Override
    public String toString() {
        return "Libro " +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", disponibilita=" + disponibilita ;
    }
}
