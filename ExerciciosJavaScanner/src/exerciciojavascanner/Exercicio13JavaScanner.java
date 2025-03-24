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

public class Exercicio13JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        
        String nome = scan.nextLine();
        
        System.out.println("Digite a altura em metros e centimetros (x,xx cm): ");
        
        double altura = scan.nextDouble();
        
        System.out.println("Digite o seu genero (sendo 1 para masculino e 2 para feminino): ");
        
        int genero = scan.nextInt();
        
        double pesoIdealM = (72.7*altura) - 58;
        double pesoIdealF = (62.1*altura) - 44.7;
        
        if(genero<2){
            System.out.println("O seu peso ideal e de: " + pesoIdealM);
        } else if (genero==2){
            System.out.println("O seu peso ideal e de: " + pesoIdealF);
        }
    }
    
}
