package traccia1a;

public class MainFilms {
    public static void main(String[] args) {
        Film film1 = new Film("un titolo","un regista",2024,5.0);
        Film film2 = new Film("un secondo titolo","un secondo regista",2023,4.0);

        CatalogoFilm catalogoFilm = new CatalogoFilm();

        catalogoFilm.addFilm(film1);

        catalogoFilm.removeFilm(film1);

        catalogoFilm.addFilm(film1);
        catalogoFilm.addFilm(film2);

        System.out.println("\nstampa l'eleco dei film\n");
        catalogoFilm.elencoFilm();
        System.out.println("\nstampa l'eleco dei film usciti in un anno specifico\n");
        catalogoFilm.printForAnnoUscita(2024);
    }
}
