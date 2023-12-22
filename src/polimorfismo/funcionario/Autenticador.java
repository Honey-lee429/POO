package polimorfismo.funcionario;

public interface Autenticador {

    public void setSenha(int senha);
    public boolean autentica(int senha);

}
