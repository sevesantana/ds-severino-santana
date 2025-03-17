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

public class Exercicio10JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salario do funcionario antes do reajuste: ");
        
        double salario = scan.nextDouble();
        
        double reajuste = 7.5;
        double salarioReajuste = salario+(reajuste*salario/100);
        
        System.out.println("O salario apos o reajuste sera de: R$" + salarioReajuste);
    }
}
