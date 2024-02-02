package traccia1;

public class Quadrato extends FormaGeometrica{
    private Double lato;
    public Quadrato(String colore,Double lato) {
        super(colore);
        this.lato = lato;
    }

    @Override
    public String toString() {
        return "Quadrato{" + "colore='" + getColore() + '\'' +
                "lato=" + lato +
                '}';
    }

    @Override
    public Double calcoloArea() {
       return(lato*lato);
    }
}
