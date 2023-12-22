package polimorfismo.animal.tipoanimal;

import polimorfismo.animal.tipoanimal.Animal;

public class Peixe extends Animal {
    private String cor;

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo plancton");
    }

    @Override
    public void emitirSom() {
        System.out.println("glu glu");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
