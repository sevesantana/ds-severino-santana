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

public class Exercicio4JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a base do retangulo: ");
        
        double base = scan.nextDouble();
        
        System.out.println("Digite a altura do retangulo: ");
        
        double altura = scan.nextDouble();
        
        double area = base*altura;
        
        System.out.println("A area do retangulo e: " + area);
        
        
    }
}
