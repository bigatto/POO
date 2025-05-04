package exercicio_09;
public class Exercicio_09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa(22, "Pedro", "M");
        p[1] = new Pessoa(25, "Maria", "F");
        l[0] = new Livro ("Aprendendo Java", "Jose da silva", 300, p[0]);
        l[1] = new Livro ("POO para iniciantes", "Pedro Paulo", 500 , p[1]);
        l[2] = new Livro ("Java Avancado", "Maria Candido", 800, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());        
        System.out.println(l[1].detalhes());
    }
    
}
