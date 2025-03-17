/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojavascanner;

/**
 *
 * @author snsf2
 */
import java.util.Scanner;

public class Exercicio2JavaScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Distancia total em km: ");
        
        double distancia = scan.nextDouble();
        
        System.out.println("Combustivel gasto em litros: ");
        
        double combustivel = scan.nextDouble();
        
        double media = combustivel/distancia;
        
        if(media<1){
            double mediaml = media*1000;
            
            System.out.println("A media de combustivel gasto e de: " + mediaml + "mL por km.");
        } else {
            System.out.println("A media de combustivel gasto e de: " + media + "L por km.");
        }
    }
    
}
