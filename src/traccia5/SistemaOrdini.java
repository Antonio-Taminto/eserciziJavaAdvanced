package traccia5;

import java.util.ArrayList;

public class SistemaOrdini {
    private ArrayList<Ordine> ordineArrayList;

    public SistemaOrdini(){
        this.ordineArrayList = new ArrayList<>();
    }

    public ArrayList<Ordine> getOrdineArrayList() {
        return ordineArrayList;
    }
    public void addOrdine(Ordine ordine){
        if(!ordineArrayList.contains(ordine)){
            ordineArrayList.add(ordine);
        }
    }

    public void removeOrdine(Ordine ordine){
        ordineArrayList.remove(ordine);
    }

    public void stampaElencoOrdini(){
        for(Ordine ordine :ordineArrayList){
            System.out.println(ordine.toString());
        }
    }

}
