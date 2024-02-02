package traccia4;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libroArrayList;

    public Biblioteca() {
        this.libroArrayList = new ArrayList<>();
    }

    public ArrayList<Libro> getLibroArrayList() {
        return libroArrayList;
    }

    public void addLibro(Libro libro){
        if(!libroArrayList.contains(libro)){
            libroArrayList.add(libro);
        }
    }

    public void removeLibro(Libro libro){
        libroArrayList.remove(libro);
    }

    public void stampaLibroPerAutore(String autore){
        for (Libro libro:libroArrayList){
            if(libro.getAutore().equals(autore)&&libro.isDisponibilita()){
                System.out.println(libro.toString());
            }
        }
    }
    public void stampaLibroPerGenere(String genere){
        for (Libro libro:libroArrayList){
            if(libro.getGenere().equals(genere)&&libro.isDisponibilita()){
                System.out.println(libro.toString());
            }
        }
    }
}
