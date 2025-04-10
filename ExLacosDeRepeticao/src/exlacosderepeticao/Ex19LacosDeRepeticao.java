/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exlacosderepeticao;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Ex19LacosDeRepeticao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int menorValor = 0;
        int maiorValor = 0;
        int somaValores = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite um numero: ");
            
            int j = scan.nextInt();
            
            if(j>1000){
                System.out.println("Digite um numero entre 0 e 1000.");
                i--;
            }
            
            int menorValor2 = j;
            
            if(menorValor>j){
                menorValor = j;
            }
            if(maiorValor<j && maiorValor<1000){
                maiorValor = j;
            }
            
            somaValores = somaValores+j;
        }
        System.out.println("O menor valor desse conjunto de numeros e: "+ menorValor);
        System.out.println("O maior valor desse conjunto de numeros e: "+ maiorValor);
        System.out.println("A soma dos valores e: "+ somaValores);
    }
}
