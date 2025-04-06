/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciowhile;

/**
 *
 * @author snsf2
 */
import java.util.Scanner;

public class Exercicio5While {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int maiorNumero = 0;
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Digite um numero: ");
            
            int j = scan.nextInt();
            
            if(maiorNumero<j){
                maiorNumero = j;
            }
        }
        
        System.out.println("O maior numero que voce digitou: " + maiorNumero);
    }
}
