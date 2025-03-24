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

public class Exercicio6JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a distancia que voce percorrera (em km): ");
        
        double distancia = scan.nextDouble();
        
        System.out.println("Digite o quantos km seu carro percorre com um (1) litro de combustivel: ");
        
        double kmL = scan.nextDouble();
        
        System.out.println("Digite o tipo de combustivel sendo 1 para gasolina e 2 para alcool: ");
        
        int tipo = scan.nextInt();
        
        double precoGasolina = 6.36;
        double precoAlcool = 4.13;
        
        if (tipo==1){
            double gastoFinalGasolina = distancia/kmL*precoGasolina;
            System.out.println("O custo estimado de combustivel dessa viagem e de: " + gastoFinalGasolina);
        } else if (tipo==2){
            double gastoFinalAlcool = distancia/kmL*precoAlcool;
            System.out.println("O custo estiamdo de combustivel dessa viagem e de: " + gastoFinalAlcool);
        } else {
            System.out.println("Por favor, escolha um tipo de combustivel valido. ");
        }
    }
    
}
