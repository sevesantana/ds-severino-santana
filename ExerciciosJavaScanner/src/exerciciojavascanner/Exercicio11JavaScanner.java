/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojavascanner;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Exercicio11JavaScanner {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o preco de fabrica do carro para saber qual sera o preco final: ");
        
        double precoFabrica = scan.nextDouble();
        
        double percentualDistribuidor = 28*precoFabrica/100;
        double impostos = 45*precoFabrica/100;
        
        double precoFinal = precoFabrica+percentualDistribuidor+impostos;
        
        System.out.println("O preco final e de: " + precoFinal);
    }
    
}
