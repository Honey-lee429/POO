package agregacao_classes;

public class Service {
    public static <l> void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("anderson", "franca", 31, 1.75f, 68.9f, 11 ,2 ,7);
        l[1] = new Lutador("mario", "brasil", 29, 1.68f,57.8f, 14,2,3);
        l[2] = new Lutador("joah","eua",35, 1.65f,80.9f,12,2,1);
        l[3] = new Lutador("mario", "australia",28,1.96f,81.6f,13,0,2);
        l[4] = new Lutador("douglas","africa do sul",37,1.70f,119.3f,5,4,3);
        l[5] = new Lutador("gil","mexico",30,1.81f,105.7f,12,2,4);

        Luta luta = new Luta();
        luta.marcarLuta(l[0], l[1]);
        luta.lutar();
        l[0].status();
        l[1].status();

//        for (int i = 0; i < l.length; i++) {
//            System.out.println(l[i].status() + " Posicao " + i);
//        }


    }
}
