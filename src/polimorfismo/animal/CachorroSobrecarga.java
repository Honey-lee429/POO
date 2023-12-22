package polimorfismo.animal;

import polimorfismo.animal.tipoanimal.Mamifero;

import java.util.Objects;

public class CachorroSobrecarga extends Mamifero {
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

    //SOBRECARGA DE MÉTODOS
    public void reagir(String frase){
        if (Objects.equals(frase, "toma comida") || Objects.equals(frase, "ola")){
            System.out.println("abanar o rabo");
        } else {
            System.out.println("rosnar");
        }

    }
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("abanar");
        } else if (hora >= 18) {
            System.out.println("ignorar");
        } else
            System.out.println("abanar o rabo");
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("abanar");
        } else System.out.println("rosnar e latir");
        this.emitirSom();
    }
    public void reagir(int idade, float peso){
        if (idade<5){
            if (peso<10){
                System.out.println("abanar");
            } else System.out.println("latir");
        } else {
            if (peso<10){
                System.out.println("rosnar");
            } else System.out.println("ignorar");
        }
    }
}
