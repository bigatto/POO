package uec;
public class UEC {
    public static void main(String[] args) {
        // TODO code application logic here
        Atleta l[] = new Atleta[6];
        l[0] = new Atleta ("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Atleta ("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Atleta ("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Atleta ("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Atleta ("UFOCobol", "Brasil", 37, 1.7f, 119.3f, 5, 4, 3);
        l[5] = new Atleta ("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        

        Luta UEC = new Luta();
        UEC.marcarLuta(l[0], l[1]);
        UEC.lutar();


    }
    
}
