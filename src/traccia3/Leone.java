package traccia3;

public class Leone extends Animale{
    public Leone(String nome, Integer eta) {
        super(nome, eta);
    }

    @Override
    public String toString() {
        return "Leone" +
                "nome='" + getNome() + '\'' +
                ", eta=" + getEta() ;
    }

    @Override
    public String emettiSuono() {
        return "Ruggito";
    }
}
