package traccia2;

public class MainDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Manager("un Manager",2000.0);
        Dipendente dipendente2 = new Sviluppatore("uno Sviluppatore",1500.0);


        GestoreDipendenti gestoreDipendenti = new GestoreDipendenti();

        gestoreDipendenti.addDipendente(dipendente1);
        gestoreDipendenti.addDipendente(dipendente2);

        gestoreDipendenti.stampaElencoDipendenti();

        System.out.println("somma mensiele di tutti i salari :" + gestoreDipendenti.sommaSalatiDipendentiMensile());
        System.out.println("somma annuale di tutti i salari :" + gestoreDipendenti.sommaSalatiDipendentiAnnuale());




    }
}
