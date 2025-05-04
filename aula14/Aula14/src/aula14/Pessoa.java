package aula14;
public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected float exp;

    public Pessoa(String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setExp(0);
    }    
    
    
    protected void ganharExp(){
        this.setExp(this.getExp()+1);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExp() {
        return exp;
    }
    public void setExp(float exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", exp=" + exp + '}';
    }
    
}
