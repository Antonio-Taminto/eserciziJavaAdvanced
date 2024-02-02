package traccia3;

public abstract class Animale {
    private String nome;
    private Integer eta;

    public Animale(String nome, Integer eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Animale" +
                "nome='" + nome + '\'' +
                ", eta=" + eta ;
    }

    public abstract String emettiSuono();
}
