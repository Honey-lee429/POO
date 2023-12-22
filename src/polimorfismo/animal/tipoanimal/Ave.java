package polimorfismo.animal.tipoanimal;

import polimorfismo.animal.tipoanimal.Animal;

public class Ave extends Animal {
    private String cor;

    @Override
    public void locomover() {
        System.out.println("ave voando");
    }

    @Override
    public void alimentar() {
    System.out.println("ave comendo frutas e insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }

    public void fazerNinho(){
        System.out.println("ave construiu um ninho");
    }
}
