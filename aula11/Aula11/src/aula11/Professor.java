package aula11;
public class Professor extends Pessoa{
    private String esp;
    private float salario;

    public void receberAumento(float s){
        this.setSalario(this.getSalario()+s);
    }
    
    public String getEsp() {
        return esp;
    }
    public void setEsp(String esp) {
        this.esp = esp;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
