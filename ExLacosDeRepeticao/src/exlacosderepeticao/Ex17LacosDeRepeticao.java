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

public class Ex17LacosDeRepeticao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro para ser mostrado o seu fatorial: ");
        
        int numero = scan.nextInt();
        
        for (int i = numero; i >= 1; i--){
            int fatorial = numero*i;
            
            System.out.println(numero +" x "+ i +" = "+ fatorial);
        }
    }
}
