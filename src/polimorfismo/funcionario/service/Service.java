package polimorfismo.funcionario.service;

import polimorfismo.funcionario.CalculadoraJuros;
import polimorfismo.funcionario.RegistraBonificacao;
import polimorfismo.funcionario.SistemaSenha;
import polimorfismo.funcionario.func.Gerente;
import polimorfismo.funcionario.func.Programador;
import polimorfismo.funcionario.func.TechLead;

public class Service {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(100);
        System.out.println("gerente " +gerente.bonificacao());
        RegistraBonificacao registraBonificacao1 = new RegistraBonificacao();
        registraBonificacao1.registra(gerente);
        System.out.println("gerente reg "+registraBonificacao1.getSoma());
        gerente.setSenha(222);


        Programador programador = new Programador();
        programador.setNome("marcio");
        programador.setSalario(100);
        System.out.println("programador " +programador.bonificacao());


        TechLead techLead = new TechLead();
        techLead.setSalario(100);
        RegistraBonificacao registraBonificacao = new RegistraBonificacao();
        registraBonificacao.registra(techLead);
        System.out.println("techlead "+registraBonificacao.getSoma());
        techLead.setSenha(125);


        SistemaSenha senha = new SistemaSenha();
        senha.autenticado(gerente);
        senha.autenticado(techLead);

        CalculadoraJuros calculadoraJuros = new CalculadoraJuros();
        calculadoraJuros.calculaJuros(techLead);
        calculadoraJuros.calculaJuros(gerente);
        System.out.println("total juros "+calculadoraJuros.getTotalJuros());


    }
}
