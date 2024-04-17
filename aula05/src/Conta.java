public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta(int numConta, String dono) {
        this.setNumConta(numConta);
        //this.setTipo(tipo);
        this.setDono(dono);
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "cc"){
            this.setSaldo(50);
        }else if (tipo == "cp"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public boolean fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta não pode ser fechada. O saldo é superior a zero!");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada. O saldo é negativo!");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
        return getStatus();

    }

    public double depositar(double valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso!");
        }else {
            System.out.println("Impossível realizar depósito!");
        }

        return this.saldo;
    }

    public double sacar(double valor){
        if (this.getStatus() && this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("O valor excede o saldo");
        }
        return saldo;
    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "cc"){
            v = 15;
        }else {
            v = 20;
        }

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso.");
        }else {
            System.out.println("Impossível pagar mensalidade com uma conta fechada.");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numConta=" + this.getNumConta() +
                ", tipo='" + this.getTipo() + '\'' +
                ", dono='" + this.getDono() + '\'' +
                ", saldo=" + this.getSaldo() +
                ", status=" + this.getStatus() +
                '}';
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
