package abstratoMetodo;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // metodo abstrato
    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("ESTA DESLIGADO");
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(0);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println(" MENU ");
            System.out.println("esta ligado " + this.isLigado());
            System.out.println("esta tocando " + this.isTocando());
            System.out.print("volume = " + this.getVolume() + " ");
            for (int i=1; i<= this.getVolume(); i+=10){
                System.out.print("> ");
            }
            System.out.println("");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("fechando menu");
        }
    }

    @Override
    public int maisVolume(int volume) {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + volume);
        }
        return volume;
    }

    @Override
    public int menosVlume(int volume) {
        if (this.isLigado()){
            this.setVolume(this.getVolume()- volume);
        }
        return volume;
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getVolume()==0 && this.isLigado()){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
}
