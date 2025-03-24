/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojava;

/**
 *
 * @author snsf2
 */
public class Exercicio6Java {
    public static void main(String[]args){
        float precoGasolina = 6.14f;
        float gastoQuilometro = 0.1f;
        float distanciaTotal = 100;
        
        float custoCombustivel = distanciaTotal*gastoQuilometro*precoGasolina;
        
        System.out.println("O custo total com combustivel foi de: R$" + custoCombustivel);
    }
    
}
