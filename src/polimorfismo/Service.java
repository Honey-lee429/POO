package polimorfismo;

import polimorfismo.animal.Cachorro;
import polimorfismo.animal.Canguru;

public class Service {
    public static void main(String[] args) {
        Canguru c = new Canguru();
        c.locomover();
        c.emitirSom();
        c.usarBolsa();

        Cachorro dog = new Cachorro();
        dog.locomover();
        dog.enterrarOsso();
        dog.abanarRabo();
        dog.emitirSom();
    }
}
