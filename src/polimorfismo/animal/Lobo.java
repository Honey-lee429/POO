package polimorfismo.animal;

public class Lobo extends CachorroSobrecarga {
    public void cacando(){
        System.out.println("lobo cacando");
    }

    public void abanarRabo(){
        System.out.println("lobo abanando rabo");
    }

    @Override
    public void emitirSom(){
        System.out.println("auuuuuuuuuuuuuu");
    }
}
