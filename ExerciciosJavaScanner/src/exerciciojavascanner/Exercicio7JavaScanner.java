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

public class Exercicio7JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva um numero: ");
        
        int numero = scan.nextInt();
        
        int antecessor = numero-1;
        
        System.out.println("O antecessor desse numero e " + antecessor);
    }
}
