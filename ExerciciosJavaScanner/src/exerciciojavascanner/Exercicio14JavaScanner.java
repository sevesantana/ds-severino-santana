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

public class Exercicio14JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero de litros vendidos: ");
        
        double litrosVendidos = scan.nextDouble();
        
        System.out.println("Escreva o tipo de combustivel (1 para gasolina e 2 para alcool)");
        
        int tipo = scan.nextInt();
        
        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        double precoGasolinaUm = litrosVendidos*(precoGasolina-(4*precoGasolina/100));
        double precoGasolinaDois = litrosVendidos*(precoGasolina-(6*precoGasolina/100));
        double precoAlcoolUm = litrosVendidos*(precoAlcool-(3*precoGasolina/100));
        double precoAlcoolDois = litrosVendidos*(precoAlcool-(5*precoGasolina/100));
        
        
        if(tipo==1 || litrosVendidos<20){
            System.out.println("O preço final de " + litrosVendidos + "L de gasolina foi de: R$" + precoGasolinaUm);
        }else if(tipo==1 || litrosVendidos>=20){
            System.out.println("O preço final de " + litrosVendidos + "L de gasolina foi de: R$" + precoGasolinaDois);
        }else if(tipo==2 || litrosVendidos<20){
            System.out.println("O preço final de " + litrosVendidos + "L de Alcool foi de: R$" + precoAlcoolUm);
        }else if(tipo==2 || litrosVendidos>=20){
            System.out.println("O preço final de " + litrosVendidos + "L de Alcool foi de: R$" + precoAlcoolDois);
        }
    }
    
}
