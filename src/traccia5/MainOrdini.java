package traccia5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MainOrdini {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Telefono",1,1000.0);
        Prodotto prodotto2 = new Prodotto("Tablet",1,500.0);
        Prodotto prodotto3 = new Prodotto("Caricatore",1,25.50);
        Prodotto prodotto4 = new Prodotto("Filo",1,10.0);

        Ordine ordine1 = new Ordine(LocalDate.of(2024,2,2),new ArrayList<>(Arrays.asList(prodotto1,prodotto3,prodotto4)),StatoEnum.INLAVORAZIONE);
        Ordine ordine2 = new Ordine(LocalDate.of(2024,2,1),new ArrayList<>(Arrays.asList(prodotto2,prodotto3,prodotto4)),StatoEnum.INLAVORAZIONE);

        SistemaOrdini sistemaOrdini = new SistemaOrdini();
        sistemaOrdini.addOrdine(ordine1);
        sistemaOrdini.addOrdine(ordine2);

        System.out.println("visualizza l'elenco degli ordini");
        sistemaOrdini.stampaElencoOrdini();

        sistemaOrdini.consegnaOrdine(ordine1);

        System.out.println("visualizza l'elenco degli ordini");
        sistemaOrdini.stampaElencoOrdini();
    }
}
