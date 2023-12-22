package polimorfismo.animal;

import polimorfismo.animal.tipoanimal.Mamifero;

public class Canguru extends Mamifero {
    public void usarBolsa() {
        System.out.println("canguro dentro da bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("canguru locomove pulando");
    }

}
