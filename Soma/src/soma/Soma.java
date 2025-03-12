/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soma;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Entre com seu nome: ");
        
        String nomeusuario = teclado.nextLine();
        
        System.out.println("Nome do Usuario: " + nomeusuario);
    }
    
}
