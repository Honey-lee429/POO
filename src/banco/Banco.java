package banco;

import java.util.UUID;

public class Banco {

    private UUID senha = UUID.randomUUID();
    private String dono;
    protected String tipo;
    public UUID numConta;
    private double saldo;
    private boolean status;

    //mapper
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.isStatus());
    }


    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "cc") {
            this.setSaldo(50.0);
        } else if (tipo.equalsIgnoreCase("cp")) {
            this.setSaldo(150);
        }
        System.out.println("conta aberta " + this.getDono());
    }

    public void fecharConta(){
        if(this.getSaldo() > 0 || this.getSaldo()  < 0){
            System.out.println("contem pendencia, nao pode fechar " + this.getDono());
        } else {
            setStatus(false);
            System.out.println("conta fechada com sucesso. Conta = " + this.getDono());
        }
    }
    public void depositar(double valor){
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("conta inexistente");
        }

    }
    public void sacar(double valor){
        if (this.isStatus()){
            if (getSaldo() >= valor){
                setSaldo(getSaldo()-valor);
            } else if (this.getSaldo() < valor){
                setSaldo(getSaldo() - valor);
                System.out.println("atencao, sua conta ficara negativa " + this.getDono() + " saldo:" + this.getSaldo());
            }
        } else {
            System.out.println("conta está encerrada " + this.getDono());
        }
    }

    public void pagarMensal(){
        float tarifa = 0;
        if(this.getTipo() == "cc" && this.isStatus()){
            tarifa = 12;
        } else if (this.getTipo() == "cp" && this.isStatus()){
            tarifa = 20;
        }

        if (this.isStatus() && this.getSaldo() > tarifa) {
            this.setSaldo(this.getSaldo() - tarifa);
            System.out.println("pagou mensal " + this.getDono() + " saldo: " + this.getSaldo());
        } else if (this.isStatus() && this.getSaldo() < tarifa) {
            System.out.println("atencao, conta negativa " + getDono());
            this.setSaldo(this.getSaldo() - tarifa);
            System.out.println("pagou mensal " + this.getDono() + " saldo: " + this.getSaldo());
        }
    }

     //Construtor
    public Banco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // metodos personalizados
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public UUID getNumConta() {
        return numConta;
    }

    public void setNumConta() {
        this.numConta = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

