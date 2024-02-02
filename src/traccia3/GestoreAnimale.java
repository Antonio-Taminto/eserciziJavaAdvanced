package traccia3;

import java.util.ArrayList;

public class GestoreAnimale {
    private ArrayList<Animale> animaleArrayList;
    public GestoreAnimale(){
        this.animaleArrayList = new ArrayList<>();
    }

    public ArrayList<Animale> getAnimaleArrayList() {
        return animaleArrayList;
    }

    public void addAnimale(Animale animale){
        if(!animaleArrayList.contains(animale)){
            animaleArrayList.add(animale);
        }
    }

    public void remove(Animale animale){
        animaleArrayList.remove(animale);
    }

    public void stampaElencoSuoni(){

        for(Animale animale : animaleArrayList){
            System.out.println(animale.toString() + "\n" + animale.emettiSuono());
        }
    }
}
