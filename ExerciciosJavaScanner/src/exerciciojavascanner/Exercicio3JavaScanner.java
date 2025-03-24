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

public class Exercicio3JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome vendedor: ");
        
        String nome = scan.nextLine();
        
        System.out.println("Salario fixo: ");
        
        double salario = scan.nextDouble();
        
        System.out.println("Dinheiro total em vendas: ");
        
        double vendas = scan.nextInt();
        
        double salarioFinal = (salario+(15*vendas/100));
        
        System.out.println("Nome vendedor: " + nome);
        System.out.println("Salario fixo: " + salario);
        System.out.println("Salario final: " + salarioFinal);
    }
    
}
