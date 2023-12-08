package heranca;

public class AlunoBolsista extends Aluno{
    protected String matricula;
    private String curso;
    //final não pode ser herdado
    public final void renovarBolsa(){
        System.out.println("renovando bolsa do aluno " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("aluno eh bolsista");
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getCurso() {
        return curso;
    }

    @Override
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setBolsa(float v) {
        System.out.println("bolsa 100% doaluno " + getNome());
    }
}
