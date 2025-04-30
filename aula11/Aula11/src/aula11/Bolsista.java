package aula11;
public final class Bolsista extends Aluno{
    private float bolsa;

    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    
    
    @Override
    public void PagarMensal(){
        System.out.println(this.getNome()+" eh bolsista, o pagamento foi facilitado!");
    }
    
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }    
    
}
