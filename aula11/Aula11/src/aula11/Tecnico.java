package aula11;
public final class Tecnico extends Aluno{
    private int registro;

    public void praticar(){
        System.out.println(this.getNome()+" esta trabalhando no projeto.");
    }
    
    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
}
