package traccia1a;

import java.util.ArrayList;

public class CatalogoFilm {
    private ArrayList<Film> filmArrayList;

    public CatalogoFilm() {
        this.filmArrayList = new ArrayList<>();
    }

    public ArrayList<Film> getFilmArrayList() {
        return filmArrayList;
    }

    public void addFilm(Film film){
        if(!filmArrayList.contains(film)){
            filmArrayList.add(film);
        }
    }
    public void removeFilm(Film film){
        filmArrayList.remove(film);
    }

    public void elencoFilm(){
        for(Film film: filmArrayList){
            System.out.println(film.getTitolo() + " uscito il: " + film.getAnnoUscita() + " ha come regista: " +
                                film.getRegista()+ " valutazione della critica: " +film.getValutazione());
        }
    }

    public void printForAnnoUscita(Integer anno){
        for(Film film : filmArrayList){
            if(film.getAnnoUscita().equals(anno)){
                System.out.println(film.getTitolo() + " uscito il: " + film.getAnnoUscita() + " ha come regista: " +
                        film.getRegista()+ " valutazione della critica: " +film.getValutazione());
            }
        }
    }



}
