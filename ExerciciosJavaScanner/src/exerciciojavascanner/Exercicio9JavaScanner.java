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
public class Exercicio9JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Numero total de eleitores na cidade: ");
        
        int totalEleitores = scan.nextInt();
        
        System.out.println("Numero total de votos validos: ");
        
        int totalValidos = scan.nextInt();
        
        System.out.println("Numero total de votos brancos: ");
        
        int totalBrancos = scan.nextInt();
        
        System.out.println("Numero total de votos nulos: ");
        
        int totalNulos = scan.nextInt();
        
        double porcentagemValidos = (double) totalValidos/totalEleitores*100;
        double porcentagemBrancos = (double) totalBrancos/totalEleitores*100;
        double porcentagemNulos = (double) totalNulos/totalEleitores*100;
        
        System.out.println("Numero total de eleitores: " + totalEleitores);
        System.out.println("Porcentagem de votos validos: " + porcentagemValidos);
        System.out.println("Porcentagem de votos brancos: " + porcentagemBrancos);
        System.out.println("Numero total de votos nulos: " + porcentagemNulos);
    }
}
