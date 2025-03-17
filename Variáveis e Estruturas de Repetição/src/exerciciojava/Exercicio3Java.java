/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojava;

/**
 *
 * @author snsf2
 */
public class Exercicio3Java {
    public static void main(String[]args){
        String nome = "Joao";
        int salarioFixo = 1500;
        int vendasMes = 275;
        
        int novoSalario = 1500+15%275;
        
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Salario fixo: " + salarioFixo);
        System.out.println("Salario no fim do mes: " + novoSalario);
        
    }
}
