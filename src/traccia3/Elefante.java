package traccia3;

public class Elefante extends Animale{
    public Elefante(String nome, Integer eta) {
        super(nome, eta);
    }

    @Override
    public String toString() {
        return "Elefante" +
                "nome='" + getNome() + '\'' +
                ", eta=" + getEta();
    }

    @Override
    public String emettiSuono() {
        return "Barrito";
    }
}
