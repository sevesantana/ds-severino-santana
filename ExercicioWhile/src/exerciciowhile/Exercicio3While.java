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

public class Exercicio3While {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        
        int numero = scan.nextInt();
        
        for(int i = 1; i <= numero; i += 2){
            System.out.println("Impares: " + i);
        }
        
        for(int j = 0; j <= numero; j += 2){
            System.out.println("Pares: " + j);
        }
    }
}
