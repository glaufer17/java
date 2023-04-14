/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapoo;

/**
 *
 * @author GLAUFER
 */
public class JavaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contador contador = new Contador();
        
        Scanner sc = new Scanner(System.in);
        
        int op = 1;
        int opcao = 0;
        while(op != 0){
            System.out.println("\n 1- Zerar");
            System.out.println("\n 2- Incrementar");
            System.out.println("\n 3- Retornar valor");
            System.out.println("\n 0- Sair");
        
            switch(opcao){
                case 1:
                    contador.zerar();
                break;
                case 2:
                    contador.incrementar();
                break;
                case 3:
                    System.out.println("\n\nO valor atual eh : "contador.getValor());
                    contador.getValor();
                break;
            }
            
            
    }
    
}
