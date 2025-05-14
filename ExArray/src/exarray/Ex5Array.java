/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exarray;

/**
 *
 * @author snsf2
 */
public class Ex5Array {
    public static void main(String[] args){
        int n[] = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < n.length; i++){
            if(n[i]%2 == 0){
                pares += 1;
            } else {
                impares += 1;
            }
        }
        
        System.out.println("Esse vetor tem " + pares + " numeros pares e " + impares + " numeros impares.");
    }
}
