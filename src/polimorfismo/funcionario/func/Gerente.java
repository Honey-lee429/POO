package polimorfismo.funcionario.func;

import polimorfismo.funcionario.Juros;
import polimorfismo.funcionario.util.AutenticaUtil;
import polimorfismo.funcionario.Autenticador;
import polimorfismo.funcionario.Funcionario1;

public class Gerente extends Funcionario1 implements Autenticador, Juros {

    public AutenticaUtil autenticaUtil;

    public Gerente() {
        this.autenticaUtil = new AutenticaUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticaUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticaUtil.autentica(senha);
    }

    @Override
    public double bonificacao() {
        return 0.2;
    }

    @Override
    public double getValorJuros() {
        return 0.50;
    }


    //    public double bonif(){
//        return super.bonificacao(0.5);
//    }

}
