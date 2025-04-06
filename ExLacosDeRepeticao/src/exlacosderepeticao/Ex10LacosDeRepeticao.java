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

public class Ex10LacosDeRepeticao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de N: ");
        
        int n = scan.nextInt();
        
        for(int j = 1; j <= n; j++){
            System.out.println("Esses sao os numeros entre 1 e N: "+ j);
        }
    }
}
