package aula14;
//interface que liga Gafanhoto à video
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }    
    
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int n){
        this.filme.setAvaliacao(n);
    }
    
    public void avaliar(float n){
        int t=0;
        if (n <= 20){
            t=3;
        }else if (n <= 50){
            t=5;
        }else if (n <= 90){
            t=8;
        }else{
            t=10;
        }
        this.filme.setAvaliacao(t);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
       
}
