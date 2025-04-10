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

public class Exercicio7While {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do lado do quadrado em numeros inteiros: ");
        
        int lado = scan.nextInt();
        
        int area = lado*lado;
        
        for(int i = 1; i <= area; i++)
        {
            System.out.print("*");
            
            if(i == lado){
                System.out.print("\n");
                i = i - lado;
                area = area - lado;
            }
        }  
    }
}
