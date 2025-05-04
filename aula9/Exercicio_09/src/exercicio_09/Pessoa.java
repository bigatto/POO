package exercicio_09;
public class Pessoa {
    private int idade;
    private String nome, sexo;

    public Pessoa(int idade, String nome, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
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
        
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
    }
    
}
