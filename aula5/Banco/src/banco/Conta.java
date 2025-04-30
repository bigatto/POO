package banco;

public class Conta {
    public int num;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void estadoAtual(){
        System.out.println("----------------------");
        System.out.println("Conta: "+this.getNum());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50);
        }else {
            if (t.equals("CP")){
                this.setSaldo(150);
            }
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada porque ainda tem dinheiro");
        }else if (this.getSaldo() <0){
            System.out.println("Conta nao pode ser fechada pois tem debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+v);   
            System.out.println("Deposito realizado na conta de "+this.getDono());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            } 
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    
    public void pagarMensal(){
        int v=0;
        if (this.getTipo().equals("CC")){
            v = 12;
        }else if (this.getTipo().equals("CP")){
            v = 20;
        }
        if (this.isStatus()){
            if (this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por "+this.getDono());
            }else {
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        }else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }
    
    //getters and setters
    public int getNum() {
        return this.num;
    }
    public void setNum(int n) {
        this.num = n;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
