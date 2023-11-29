package banco;

import banco.Banco;

public class Service {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setDono("jubileu");
        p1.setNumConta();
        p1.abrirConta("cc");
        p1.depositar(50);
        p1.sacar(90);
        p1.pagarMensal();

        Banco p2 = new Banco();
        p2.setDono("neuza");
        p2.setNumConta();
        p2.abrirConta("cp");
        p2.depositar(200);
        p2.sacar(400);
        p2.fecharConta();



        p1.estadoAtual();
        p2.estadoAtual();

    }
}

