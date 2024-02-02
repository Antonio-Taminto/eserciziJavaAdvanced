package traccia2a;

public class MainContatti {
    public static void main(String[] args) {
        Contatto contatto1 = new Contatto("un nome","un cognome","3332225566","email@email.com");
        Contatto contatto2 = new Contatto("un secondo nome","un secondo cognome","3334445588","email@email.it");

        RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();

        rubricaTelefonica.addContatto(contatto1);
        rubricaTelefonica.removeContatto(contatto1);

        rubricaTelefonica.addContatto(contatto1);
        rubricaTelefonica.addContatto(contatto2);

        System.out.println("\nstampa elenco contatti\n");
        rubricaTelefonica.stampaElencoContatti();
        System.out.println("\nstampa contatti con un numero specifico\n");
        rubricaTelefonica.cercaContattoPerNumero("3332225566");
    }
}
