package abstratoMetodo;

public class Service {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.maisVolume(50);
        c1.menosVlume(20);
        c1.pause();
        c1.ligarMudo();
        c1.desligarMudo();
        c1.play();
        c1.desligar();

        c1.abrirMenu();
        c1.fecharMenu();
        //System.out.println(c1);
    }
}