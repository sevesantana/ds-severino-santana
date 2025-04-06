/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exlacosderepeticao;

/**
 *
 * @author snsf2
 */
import java.util.Scanner;

public class Ex13LacosDeRepeticao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = 0;
        
        for(int i = 1; i < 2; i++){
            System.out.println("Digite um numero entre 1 e 10 para ser mostrada sua tabuada: ");
            
            int n2 = scan.nextInt();
            
            if(n2 < 1 || n2 > 10){
                System.out.println("Apenas sao aceitos numeros entre 1 e 10.");
                i--;
            }
            
            n = n2;
        }
        
        for (int i = 1; i <= 10; i++){
            System.out.println(n +" x "+ i + " = "+ n*i);
        }
    }
}
