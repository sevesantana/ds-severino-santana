/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exarray;

/**
 *
 * @author snsf2
 */
public class Ex2Array {
    public static void main(String[] args){
        int[] numeros = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        
        System.out.println("A soma dos numeros e: " + soma);
    }
}
