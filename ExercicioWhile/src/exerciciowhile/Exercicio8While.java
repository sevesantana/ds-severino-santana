/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciowhile;

/**
 *
 * @author snsf2
 */
import java.util.Scanner;

public class Exercicio8While {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do lado do quadrado em numeros inteiros: ");
        
        int lado = scan.nextInt();
        
        for(int i = 1; i <= lado; i++)
        {
            System.out.print("*");
            
            if(i == lado)
            {
                System.out.print("\n");
            }
        }
        for(int k = 1; k <= lado-2; k++)
        { 
            for(int i = 1; i <= 2; i++)
            {
                System.out.print("*");
            
                for(int j = 1; j <= (lado-2); j++)
                {
                    System.out.print(" ");
                }
            
                if(i % 2 == 0)
                {
                    System.out.print("\n");
                }
            }
        }
         for(int i = 1; i <= lado; i++)
        {
            System.out.print("*");
            
            if(i == lado)
            {
                System.out.print("\n");
            }
        }
    }
}
