/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojavascanner;

/**
 *
 * @author snsf2
 */
import java.util.Scanner;

public class ExercicioJavaScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Numero 1: ");
        
        double numero1 = scan.nextDouble();
        
        System.out.println("Numero 2: ");
        
        double numero2 = scan.nextDouble();
        
        double soma = (numero1+numero2);
        double subtracao = (numero1-numero2);
        double multiplicacao = (numero1*numero2);
        double divisao = (numero1/numero2);
        
        System.out.println("A soma dos numeros e: " + soma);
        System.out.println("A subtracao dos numeros e: " + subtracao);
        System.out.println("A multiplicacao dos numeros e: " + multiplicacao);
        System.out.println("A divisao dos numeros e: " + divisao);
        
      
    }
    
}
