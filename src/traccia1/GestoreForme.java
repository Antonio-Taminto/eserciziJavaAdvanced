package traccia1;

import java.util.ArrayList;

public class GestoreForme {
    private ArrayList<FormaGeometrica> formaGeometricaArrayList;
    public GestoreForme(){
        this.formaGeometricaArrayList = new ArrayList<>();
    }

    public ArrayList<FormaGeometrica> getFormaGeometricaArrayList() {
        return formaGeometricaArrayList;
    }
    public void addForma(FormaGeometrica forma){
        if(!formaGeometricaArrayList.contains(forma)){
            formaGeometricaArrayList.add(forma);
        }
    }
    public void removeForma(FormaGeometrica forma){
        formaGeometricaArrayList.remove(forma);
    }
    public void printForme(){
        for(FormaGeometrica forma : formaGeometricaArrayList){
            System.out.println(forma.toString());
        }
    }
    public void calcoloTotaleArea(){
        Double totaleArea = 0.0;
        for (FormaGeometrica forma : formaGeometricaArrayList){
            totaleArea += forma.calcoloArea();
        }
        System.out.println("totale Area di tutte le forme = " + totaleArea);
    }
}
