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
public class Ex11LacosDeRepeticao {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = 0;
        
        for(int i = 1; i < 2; i++){
            System.out.println("Digite o valor de N: ");
            
            int n2 = scan.nextInt();
            
            if(n2 == 0){
                System.out.println("Digite um numero diferente de 0.");
                i--;
            }
            
            n = n2;
        }
        
        for(int j = 1; j <= n; j++){
            System.out.println("Esses sao os numeros entre 1 e N: "+ j);
        }
    }
}
