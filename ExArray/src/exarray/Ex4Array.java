/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exarray;

/**
 *
 * @author snsf2
 */
public class Ex4Array {
    public static void main(String[] args){
        int[] numeros = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i = 0; i < numeros.length; i++){
            i = numeros.length-numeros[i];
            System.out.println(numeros[i]);
        }
    }
}
