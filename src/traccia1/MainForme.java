package traccia1;

public class MainForme {
    public static void main(String[] args) {
        FormaGeometrica forma = new Cerchio("verde",10.0);
        FormaGeometrica forma1 = new Quadrato("rosso",5.0);

        GestoreForme gestoreForme = new GestoreForme();
        gestoreForme.addForma(forma);
        gestoreForme.addForma(forma1);

        gestoreForme.removeForma(forma1);

        gestoreForme.calcoloTotaleArea();
    }
}
