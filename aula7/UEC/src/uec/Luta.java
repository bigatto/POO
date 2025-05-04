package uec;

import java.util.Random;

public class Luta {
    private Atleta desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public Atleta getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Atleta desafiado) {
        this.desafiado = desafiado;
    }

    public Atleta getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Atleta desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


     
    
    public void marcarLuta(Atleta l1, Atleta l2){
        if (l1.getCat().equals(l2.getCat()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);            
        }else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if (this.isAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3);
            
            System.out.println("==== RESULTADO DA LUTA ====");
            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    this.getDesafiado().empate();
                    this.getDesafiante().empate();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getName()+ " ganhou!!!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println(this.getDesafiante().getName()+ " ganhou!!!");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
            System.out.println("===========================");
        }else{
            System.out.println("A luta nao pode acontecer");
        }
    }
}
