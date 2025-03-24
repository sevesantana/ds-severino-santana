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

public class Exercicio8JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva sua idade em anos...: ");
        
        int anos = scan.nextInt();
        
        System.out.println("Meses...: ");
        
        int meses = scan.nextInt();
        
        System.out.println("E dias: ");
        
        int dias = scan.nextInt();
        
        int idadeDias = (anos*365)+(meses*30)+dias;
        
        System.out.println("A sua idade em dias e: " + idadeDias);
    }
}
