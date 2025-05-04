package banco;
public class Banco {

    public static void main(String[] args) {
        // TODO code application logic here
        Conta p1 = new Conta();
        p1.setNum(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        Conta p2 = new Conta();
        p2.setNum(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);     

        p1.sacar(150);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
