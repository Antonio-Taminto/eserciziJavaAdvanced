package traccia1a;

import java.util.Date;

public class Film {
    private String titolo;
    private String regista;
    private Integer annoUscita;
    private Double Valutazione;

    public Film(String titolo, String regista, Integer annoUscita, Double valutazione) {
        this.titolo = titolo;
        this.regista = regista;
        this.annoUscita = annoUscita;
        Valutazione = valutazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public Integer getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(Integer annoUscita) {
        this.annoUscita = annoUscita;
    }

    public Double getValutazione() {
        return Valutazione;
    }

    public void setValutazione(Double valutazione) {
        Valutazione = valutazione;
    }


}
