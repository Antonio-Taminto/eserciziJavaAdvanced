package traccia1;

public abstract class FormaGeometrica {
    private String colore;
    public FormaGeometrica(String colore){
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "colore='" + colore + '\'' +
                '}';
    }

    public abstract Double calcoloArea();
}
