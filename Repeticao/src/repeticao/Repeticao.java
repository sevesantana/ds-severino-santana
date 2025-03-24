/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao;


/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        
        int numero = scan.nextInt();
        
        for (int i = numero; i <=10; i++) 
        {
            System.out.println("O seu numero e: " + i);
        }
    }
    
}
