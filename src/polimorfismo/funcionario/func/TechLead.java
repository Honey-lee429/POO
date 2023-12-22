package polimorfismo.funcionario.func;

import polimorfismo.funcionario.Juros;
import polimorfismo.funcionario.util.AutenticaUtil;
import polimorfismo.funcionario.Autenticador;
import polimorfismo.funcionario.Funcionario1;

public class TechLead extends Funcionario1 implements Autenticador, Juros {
    private final AutenticaUtil autenticaUtil;

    public TechLead() {
        this.autenticaUtil = new AutenticaUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticaUtil.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticaUtil.autentica(senha);
    }

//    public double bonif(){
//        return super.bonificacao(0.7);
//    }

    @Override
    public double bonificacao() {
        return 0.7 * getSalario();
    }

    @Override
    public double getValorJuros() {
        return 0.10;
    }
}
