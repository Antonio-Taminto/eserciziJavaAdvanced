package traccia2;

import traccia1a.Film;

import java.util.ArrayList;

public class GestoreDipendenti {
    private ArrayList<Dipendente> dipendenteArrayList;

    public GestoreDipendenti(){
        this.dipendenteArrayList = new ArrayList<>();
    }

    public ArrayList<Dipendente> getDipendenteArrayList() {
        return dipendenteArrayList;
    }
    public void addDipendente(Dipendente dipendente){
        if(!dipendenteArrayList.contains(dipendente)){
            dipendenteArrayList.add(dipendente);
        }
    }
    public void removeDipendente(Dipendente dipendente){
        dipendenteArrayList.remove(dipendente);
    }

    public void stampaElencoDipendenti(){
        for(Dipendente dipendente : dipendenteArrayList){
            System.out.println(dipendente.toString());
        }
    }
    public Double sommaSalatiDipendentiMensile(){
        Double sommaSalari = 0.0;
        for (Dipendente dipendente : dipendenteArrayList){
            sommaSalari += dipendente.getSalario();
        }
        return sommaSalari;
    }
    public Double sommaSalatiDipendentiAnnuale(){
        Double sommaSalari = 0.0;
        for (Dipendente dipendente : dipendenteArrayList){
            sommaSalari += dipendente.getCalcoloSalarioAnnuo();
        }
        return sommaSalari;
    }


}
