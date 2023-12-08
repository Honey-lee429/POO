package heranca;

public class Service {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa(); não pode ser instanciada, pois é abstrata

        Aluno aluno = new Aluno();
        aluno.setNome("alberto");
        aluno.setGenero("M");
        aluno.setIdade(32);
        aluno.setMatricula("ativa");
        aluno.pagarMensalidade();
        aluno.fazerAniver();

        System.out.println(aluno);


        AlunoBolsista aluno1 = new AlunoBolsista();
        aluno1.setCurso("engenharia");
        aluno1.setNome("marcia");
        aluno1.setMatricula("1212");
        aluno1.setBolsa(12.f);
        aluno1.pagarMensalidade();

        Visitante visitante = new Visitante();
    }
}
