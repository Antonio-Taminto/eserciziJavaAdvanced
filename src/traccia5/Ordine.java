package traccia5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ordine {
    private Integer numeroOrdine = 1;
    private LocalDate dataCreazione;
    private ArrayList<Prodotto> prodottiOrdinati;

    public Ordine(LocalDate dataCreazione, ArrayList<Prodotto> prodottiOrdinati) {
        this.numeroOrdine++;
        this.dataCreazione = dataCreazione;
        this.prodottiOrdinati = prodottiOrdinati;
    }

    public Integer getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(Integer numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public LocalDate getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(LocalDate dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public ArrayList<Prodotto> getProdottiOrdinati() {
        return prodottiOrdinati;
    }

    public void setProdottiOrdinati(ArrayList<Prodotto> prodottiOrdinati) {
        this.prodottiOrdinati = prodottiOrdinati;
    }

    @Override
    public String toString() {
        return "Ordine " +
                "numeroOrdine=" + numeroOrdine +
                ", dataCreazione=" + dataCreazione +
                ", prodottiOrdinati=" + listaOrdini();
        };
    public StringBuilder listaOrdini(){
        StringBuilder stringa = new StringBuilder();
        for (Prodotto prodotto : prodottiOrdinati) {
           stringa.append(prodotto.toString());
           stringa.append("\n");
        }
        return stringa;
    }
}
