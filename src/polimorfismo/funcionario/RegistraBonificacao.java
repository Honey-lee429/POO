package polimorfismo.funcionario;

public class RegistraBonificacao {
    private double soma;

    public void registra(Funcionario1 l){
        double boni = l.bonificacao();
        this.soma += boni;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
