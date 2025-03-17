/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojava;

/**
 *
 * @author snsf2
 */
public class Exercicio11Java {
    public static void main(String[]args){
        int precoBase = 100000;
        int porcentagemDistribuidor = 28*100000/100;
        int porcentagemImpostos = 45*100000/100;
        int precoFinal = precoBase+porcentagemDistribuidor+porcentagemImpostos;
        
        System.out.println("O preco base e de: " + precoBase);
        System.out.println("O preco final e de: " + precoFinal);
    }
    
}
