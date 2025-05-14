/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exarray;

/**
 *
 * @author snsf2
 */
public class Ex7Array {
    public static void main(String[] args){
        int n[] = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        double soma = 0;
        
        for (int i = 0; i < n.length; i++){
            soma += n[i];
        }
        
        double media = soma/n.length;
        
        System.out.println("A media dos elementos do vetor e: " + media);
    }
}
