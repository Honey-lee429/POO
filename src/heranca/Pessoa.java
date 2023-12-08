package heranca;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    public final void fazerAniver(){
        System.out.println(this.getNome() + " fez aniversario");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                '}';
    }
}
