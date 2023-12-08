package polimorfismo.animal;

import polimorfismo.Mamifero;

public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("dog enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("dog abanando rabo");
    }

    @Override
    public void emitirSom(){
        System.out.println("au au");
    }
}
