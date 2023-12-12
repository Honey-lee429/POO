package polimorfismo;

import polimorfismo.animal.CachorroSobrecarga;
import polimorfismo.animal.Canguru;
import polimorfismo.animal.Lobo;

public class Service {
    public static void main(String[] args) {
        Canguru c = new Canguru();
        c.locomover();
        c.emitirSom();
        c.usarBolsa();

        CachorroSobrecarga dog = new CachorroSobrecarga();
        dog.locomover();
        dog.enterrarOsso();
        dog.abanarRabo();
        dog.emitirSom();
        dog.reagir("ola");
        dog.reagir("vai apanhar");
        dog.reagir(11,45);
        dog.reagir(21,0);
        dog.reagir(true);
        dog.reagir(false);
        dog.reagir(2, 12.5f);
        dog.reagir(7, 4.5f);

        Lobo l = new Lobo();
        l.cacando();
        l.emitirSom();
    }
}
