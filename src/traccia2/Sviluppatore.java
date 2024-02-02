package traccia2;

public class Sviluppatore extends Dipendente{

    public Sviluppatore(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Sviluppatore{" + "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "}";
    }

    @Override
    public Double getCalcoloSalarioAnnuo() {
        return getSalario()*13;
    }
}
