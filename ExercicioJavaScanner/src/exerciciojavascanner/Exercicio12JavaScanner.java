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

public class Exercicio12JavaScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salario fixo do funcionario em reais: ");
        
        double salarioFixo = scan.nextDouble();
        
        System.out.println("Digite o numero de carros vendidos por ele: ");
        
        int numeroCarros = scan.nextInt();
        
        System.out.println("Digite a comissao fixa para cada carro vendido em reais: ");
        
        double valorComissaoCarrosVendidos = scan.nextDouble();
        
        System.out.println("Digite o valor das vendas por ele efetuadas: ");
        
        double valorVendas = scan.nextDouble();
        
        double comissaoCarrosVendidos = valorComissaoCarrosVendidos*numeroCarros;
        double comissaoValorVendas = 5*valorVendas/100;
        double salarioFinal = salarioFixo+comissaoCarrosVendidos+comissaoValorVendas;
        
        System.out.println("O salario final sera de: " + salarioFinal);
        
        
    }
    
}
