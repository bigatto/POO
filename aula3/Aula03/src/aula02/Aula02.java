/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author thema
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada= false;
        c1.tampar();        
        c1.rabiscar();        
        c1.status();
     }
    
}
