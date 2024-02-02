package traccia2a;

import java.util.ArrayList;

public class RubricaTelefonica {
    private ArrayList<Contatto> contattoArrayList;

    public RubricaTelefonica() {
        this.contattoArrayList = new ArrayList<>();
    }

    public ArrayList<Contatto> getContattoArrayList() {
        return contattoArrayList;
    }

    public void addContatto(Contatto contatto){
        if(!contattoArrayList.contains(contatto)){
            contattoArrayList.add(contatto);
        }
    }

    public void removeContatto(Contatto contatto){
        contattoArrayList.remove(contatto);
    }

    public void stampaElencoContatti(){
        for (Contatto contatto : contattoArrayList){
            System.out.println(contatto.toString());
        }
    }

    public void cercaContattoPerNumero(String numero){
        for (Contatto contatto : contattoArrayList){
            if(contatto.getNumeroDiTelefono().equals(numero)){
                System.out.println(contatto.toString());
            }
        }
    }







}
