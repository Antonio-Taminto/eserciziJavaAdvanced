package traccia5;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return Objects.equals(nome, prodotto.nome) && Objects.equals(quantita, prodotto.quantita) && Objects.equals(prezzo, prodotto.prezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantita, prezzo);
    }

    @Override
    public String toString() {
        return "Prodotto " +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                ", prezzo=" + prezzo ;
    }
}
