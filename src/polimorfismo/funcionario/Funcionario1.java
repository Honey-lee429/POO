package polimorfismo.funcionario;

public abstract class Funcionario1 {
    private String nome;
    private double salario;

//    public  double bonificacao(double bon){
//        return this.salario *= bon;
//    }

    public abstract double bonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
