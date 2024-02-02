package traccia5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Ordine {
    private final  Integer numeroOrdine;
    private LocalDate dataCreazione;
    private ArrayList<Prodotto> prodottiOrdinati;
    private StatoEnum stato;
    private static Integer counter = 1;

    public Ordine(LocalDate dataCreazione, ArrayList<Prodotto> prodottiOrdinati,StatoEnum stato) {
        this.dataCreazione = dataCreazione;
        this.prodottiOrdinati = prodottiOrdinati;
        this.stato = stato;
        this.numeroOrdine = counter++;

    }

    public Integer getNumeroOrdine() {
        return numeroOrdine;
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

    public StatoEnum getStato() {
        return stato;
    }

    public static Integer getCounter() {
        return counter;
    }

    public void setStato(StatoEnum stato) {
        this.stato = stato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordine ordine = (Ordine) o;
        return Objects.equals(numeroOrdine, ordine.numeroOrdine) && Objects.equals(dataCreazione, ordine.dataCreazione) && Objects.equals(prodottiOrdinati, ordine.prodottiOrdinati) && stato == ordine.stato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroOrdine, dataCreazione, prodottiOrdinati, stato);
    }

    @Override
    public String toString() {
        return "Ordine " +
                "numeroOrdine=" + numeroOrdine +
                ", dataCreazione=" + dataCreazione +
                ", prodottiOrdinati=" + prodottiOrdinati +
                ", stato=" + stato.getDescizione() ;
    }

    public StringBuilder listaOrdini(){
        StringBuilder stringa = new StringBuilder();
        for (Prodotto prodotto : prodottiOrdinati) {
           stringa.append(prodotto.toString());
           stringa.append("\n");
        }
        return stringa;
    }
}
