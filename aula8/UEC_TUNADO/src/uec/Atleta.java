package uec;
public class Atleta {
    private String name, pais, cat;
    private int idade, vit, der, emp, pv, ac;
    private float altura, peso;

    public Atleta(String name, String pais, int idade, float altura, float peso, int vit, int der, int emp) {
        this.name = name;
        this.pais = pais;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vit = vit;
        this.der = der;
        this.emp = emp;        
    }

    public void apresentar(){
        System.out.println("---------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador "+this.getName());
        System.out.println("Diretamente de "+this.getPais());
        System.out.println("Com "+this.getIdade()+" anos e "+this.getAltura()+"m");
        System.out.println("Pesando "+this.getPeso()+"kg");
        System.out.println("Com "+this.getPv()+" pontos de vida");
        System.out.println("Com "+this.getAc()+" de defesa");
        System.out.println(this.getVit()+" vitorias");
        System.out.println(this.getDer()+" derrotas e");
        System.out.println(this.getEmp()+" empates!");
    }
    
    public void status(){
        System.out.println(this.getName()+" eh um lutador peso "
                +this.getCat()+" com "+this.getVit()
                +" vitorias, "+this.getDer()+" derrotas e "+this.getEmp()
                +" empates");
    }
    
    public void ganharLuta(){
        this.setVit(this.getVit()+1);
    }
    
    public void perderLuta(){
        this.setDer(this.getDer()+1);
    }
    
    public void empate(){
        this.setEmp(this.getEmp()+1);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCat();
        this.setPv();
        this.setAc();
    }

    public String getCat() {
        return cat;
    }
    private void setCat() {
        if (this.getPeso()<52.2){
            this.cat = "Invalido";
        }else if (this.getPeso()<=70.3){
            this.cat = "Leve";
        }else if (this.getPeso()<=83.9){
            this.cat = "Medio";
        }else if (this.getPeso()<=120.2){
            this.cat = "Pesado";
        }else{
            this.cat = "Invalido";
        }   
    }
    
    public int getPv(){
        return pv;
    }
    private void setPv(){
        if ("Leve".equals(this.getCat())){
            this.pv = (int) Math.round(this.getPeso()*0.75);
        }else if ("Medio".equals(this.getCat())){
            this.pv = (int) Math.round(this.getPeso()*0.80);
        }else if ("Pesado".equals(this.getCat())){
            this.pv = (int) Math.round(this.getPeso()*0.95);
        }
    }
    
    public int getAc(){
        return ac;
    }
    public void setAc(){
        if ("Leve".equals(this.getCat())){
            this.ac = 5;
        }else if ("Medio".equals(this.getCat())){
            this.ac = 6;
        }else if ("Pesado".equals(this.getCat())){
            this.ac = 8;
        }        
    }

    public int getVit() {
        return vit;
    }
    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDer() {
        return der;
    }
    public void setDer(int der) {
        this.der = der;
    }

    public int getEmp() {
        return emp;
    }
    public void setEmp(int emp) {
        this.emp = emp;
    }
    
    
    
    
}
