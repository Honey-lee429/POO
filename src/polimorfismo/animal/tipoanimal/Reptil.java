package polimorfismo.animal.tipoanimal;

import polimorfismo.animal.tipoanimal.Animal;

public class Reptil extends Animal {
    private String cor;

    @Override
    public void locomover() {
        System.out.println("reptil rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("reptil come animais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
