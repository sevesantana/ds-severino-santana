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

public class Exercicio6While {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int maiorNumero = 0;
        int segundoMaior = 0;
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Digite um numero: ");
            
            int numero = scan.nextInt();
            
            if(maiorNumero < numero)
            {
               maiorNumero = numero; 
            }
        }
        
        System.out.println("O maior numero e: " + maiorNumero);
        System.out.println("O segundo maior e: " + segundoMaior);
    }
}
