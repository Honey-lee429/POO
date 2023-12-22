package polimorfismo.animal;

import polimorfismo.animal.tipoanimal.Reptil;

public class Tartaruga extends Reptil {
    public void locomover(){
        System.out.println("anda devagar");
    }

    public void alimentar(){
        System.out.println("verduras e frutas");
    }
}
