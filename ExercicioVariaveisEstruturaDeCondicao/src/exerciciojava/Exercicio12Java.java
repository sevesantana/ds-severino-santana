/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojava;

/**
 *
 * @author snsf2
 */
public class Exercicio12Java {
    public static void main(String[]args){
        int salarioBase = 1500;
        int carrosVendidos = 10;
        int porcentagemVendidos = 75;
        int comissaoVender = porcentagemVendidos*carrosVendidos;
        int valorVendas = 60000;
        int comissaoValor = 5*60000/100;
        int salarioFinal = salarioBase+comissaoVender+comissaoValor;
        
        System.out.println("Carros vendidos no mes: " + carrosVendidos);
        System.out.println("Valor total das vendas: " + valorVendas);
        System.out.println("Salario fixo: R$" + salarioBase);
        System.out.println("Porcentagem por carro vendido: " + porcentagemVendidos);
        System.out.println("O salario final do vendedor e de: " + salarioFinal);
    }
    
}
