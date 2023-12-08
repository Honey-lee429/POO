package agregacao_classes;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria().equals(lutador2.getCategoria())
                && lutador1 != lutador2){
            this.setAprovada(true);
            this.desafiado = lutador1;
            this.setDesafiante(lutador2);
        } else {
            this.aprovada = false;
            this.getDesafiado();
            this.getDesafiante();
        }
    }
    public void lutar(){
        if (this.isAprovada()) {
            System.out.println("DESAFIADO");
            this.getDesafiado().apresentar();
            System.out.println("DESAFIANTE");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor){
                case 0:
                    System.out.println("==================================");
                    System.out.println("empatou");
                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    break;
                case 1: //desafiado vence
                    System.out.println("==================================");
                    System.out.println(this.desafiado.getNome() + " desafiado ganhou a luta");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2: //desafiante vence
                    System.out.println("==================================");
                    System.out.println(this.getDesafiante().getNome() + " desafiante ganhou a luta");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
        } else {
            System.out.println("==================================");
            System.out.println("luta nao pode acontecer");
        }
    }



    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
