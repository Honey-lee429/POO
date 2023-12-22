package polimorfismo.animal.tipoanimal;

import polimorfismo.animal.tipoanimal.Animal;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("mamifero correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("mamifero mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
