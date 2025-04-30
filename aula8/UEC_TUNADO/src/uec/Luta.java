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
    
    private boolean round(Atleta atacante, Atleta defensor, int soco, int[] pvs) {
        if (soco >= defensor.getAc()) {
            if (soco == 20) {
                System.out.println(atacante.getName()+" acertou o queixo do "
                        +defensor.getName()+"!!!");
            } else {
                soco = soco / 2;
            }

            if (defensor == this.getDesafiado()) {
                pvs[0] -= soco;
                if (pvs[0] > 0) {
                    System.out.println(defensor.getName() + " tomou um soco de " + soco + " dano e agora tem " + pvs[0] + " pontos de vida");
                } else {
                    System.out.println(atacante.getName() + " ganhou a luta com " + pvs[1] + " pontos de vida restantes");
                    defensor.perderLuta();
                    atacante.ganharLuta();
                    System.out.println("\n=============== FIM DE LUTA ===============\n");
                    atacante.status();
                    defensor.status();
                    return true;
                }
            } else {
                pvs[1] -= soco;
                if (pvs[1] > 0) {
                    System.out.println(defensor.getName() + " tomou um soco de " + soco + " dano e agora tem " + pvs[1] + " pontos de vida");
                } else {
                    System.out.println(atacante.getName() + " ganhou a luta com " + pvs[0] + " pontos de vida restantes");
                    defensor.perderLuta();
                    atacante.ganharLuta();
                    System.out.println("\n=============== FIM DE LUTA ===============\n");
                    atacante.status();
                    defensor.status();
                    return true;
                }
            }
        } else {
            System.out.println(defensor.getName() + " defeeeeende o golpe!!");
        }
        return false;
    }
    
    public void lutar(){
        if (this.isAprovada()){
            int desafiadopv = this.getDesafiado().getPv();
            int desafiantepv = this.getDesafiante().getPv();
            int[] pvs = { desafiadopv, desafiantepv };

            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();

            this.setRounds(99);
            int round = 1;

            while (pvs[0] > 0 && pvs[1] > 0 && round <= this.getRounds()) {
                System.out.println("=============== ROUND " + (round) + " ===============");
                int turno = aleatorio.nextInt(2);
                int soco = aleatorio.nextInt(20) + 1;//simula um d20
                round++;

                boolean fim = (turno == 0) 
                    ? round(this.getDesafiado(), this.getDesafiante(), soco, pvs)
                    : round(this.getDesafiante(), this.getDesafiado(), soco, pvs);

                if (fim) return;
            }

            System.out.println("=================================================");
            System.out.println("A luta chegou no seu ultimo round sem vencedores");
            this.getDesafiado().empate();
            this.getDesafiante().empate();
            this.getDesafiado().status();
            this.getDesafiante().status();
        } else {
            System.out.println("A luta nao pode acontecer");
        }
    }
}
