package traccia2;

public class Manager extends Dipendente{
    public Manager(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Manager{"  +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "}";
    }

    @Override
    public Double getCalcoloSalarioAnnuo() {
        return getSalario()*14;
    }
}
