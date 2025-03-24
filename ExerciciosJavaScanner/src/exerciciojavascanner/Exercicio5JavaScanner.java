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

public class Exercicio5JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        
        double n1 = scan.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        
        double n2 = scan.nextDouble();
        
        double c = n2;
        double d = n1;
        
        System.out.println("Agora o valor do primeiro numero e: " + c);
        System.out.println("E agora o valor do segundo numero e: " + d);
    }
}
