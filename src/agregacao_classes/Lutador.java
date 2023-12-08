package agregacao_classes;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public boolean apresentar(){
        System.out.println("APRESENTACAO-----------------------------------");
        System.out.println("lutador: "+ this.getNome());
        System.out.println("nacionalidade: " + this.getNacionalidade());
        System.out.println("idade: " + this.getIdade());
        System.out.println("altura: " + this.getAltura() + "m");
        System.out.println("peso: " + this.getPeso() + "kg");
        System.out.println("eh um peso " + this.getCategoria());
        System.out.println("ganhou: " + this.getVitorias() + " lutas");
        System.out.println("perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("empatou: " + this.getEmpates() + " lutas");
        return true;
    }
    public boolean status(){
        System.out.println("STATUS----------------------");
        System.out.println(this.getNome());
        System.out.println("eh um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        return true;
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+ 1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates()+1);
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2 || this.getPeso() >120.3) {
        this.categoria = "peso invalido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria= "peso leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria="peso medio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria="peso pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
