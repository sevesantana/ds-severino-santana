/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exarray;

/**
 *
 * @author snsf2
 */
public class Ex3Array {
    public static void main(String[] args){
        int[] numeros = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int menor = numeros[0];
        int maior = numeros[0];
        
        for(int i : numeros){
            if(i < menor){
                menor = i;
            }
            if(i > maior){
                maior = i;
            }
        }
        
        System.out.println("O maior numero e: "+ maior);
        System.out.println("O menor numero e: "+ menor);
    }
}
