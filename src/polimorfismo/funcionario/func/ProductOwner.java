package polimorfismo.funcionario.func;

import polimorfismo.funcionario.Funcionario1;

public class ProductOwner extends Funcionario1 {
    private int senha;

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }
        return false;
    }

//    public double bonif(){
//        return super.bonificacao(0.6);
//    }


    @Override
    public double bonificacao() {
        return 0.6 * getSalario();
    }
}
