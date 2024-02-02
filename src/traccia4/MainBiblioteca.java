package traccia4;

public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("un titolo","un autore","fantasy",true);
        Libro libro2 = new Libro("un secondo titolo","un secondo autore","romanzo",true);
        Libro libro3 = new Libro("un terzo titolo","un secondo autore","fantasy",false);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);

        System.out.println("\nvisualizza libri per autore se disponibili\n");
        biblioteca.stampaLibroPerAutore("un secondo autore");
        System.out.println("\nvisualizza libri per genere se disponibili\n");
        biblioteca.stampaLibroPerGenere("fantasy");


    }
}
