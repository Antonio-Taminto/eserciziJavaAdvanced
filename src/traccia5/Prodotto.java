package traccia5;

public class Prodotto {
    private String nome;
    private Integer quantita;
    private Double prezzo;

    public Prodotto(String nome, Integer quantita, Double prezzo) {
        this.nome = nome;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto " +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                ", prezzo=" + prezzo ;
    }
}
