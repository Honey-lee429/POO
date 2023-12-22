package polimorfismo.funcionario;

public class SistemaSenha {
    private int senha = 222;

    public void autenticado(Autenticador a) {
        boolean autenticou = a.autentica(this.senha);
        if (autenticou) {
            System.out.println("acesso liberado");
        } else {
            System.out.println("acessa negado");
        }
    }
}
