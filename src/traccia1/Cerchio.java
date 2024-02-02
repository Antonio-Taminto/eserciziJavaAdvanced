package traccia1;

public class Cerchio extends FormaGeometrica{
    private Double raggio;
    public Cerchio(String colore,Double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public Double getRaggio() {
        return raggio;
    }

    public void setRaggio(Double raggio) {
        this.raggio = raggio;
    }

    @Override
    public String toString() {
        return "Cerchio{" + "colore='" + getColore() + '\'' +
                "raggio=" + raggio +
                '}';
    }

    @Override
    public Double calcoloArea() {
        return raggio * raggio * Math.PI;
    }
}
