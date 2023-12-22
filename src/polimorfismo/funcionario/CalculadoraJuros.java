package polimorfismo.funcionario;

public class CalculadoraJuros {

    private double totalJuros;

    public void calculaJuros(Juros juros) {
        double valor = juros.getValorJuros();
        this.totalJuros += valor;
    }

    public double getTotalJuros() {
        return totalJuros;
    }
}
