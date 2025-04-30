package aula12;

public class Aula12 {
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Tartaruga t = new Tartaruga();
        
        t.locomover();
        
        c.locomover();
        c.emitirSom();
        k.locomover();
        k.emitirSom();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        
        
    }
    
}
