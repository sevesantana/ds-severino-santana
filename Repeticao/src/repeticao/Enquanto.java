/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticao;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        
        int numero = scan.nextInt();
        
        while (numero <= 10)
        {
            System.out.println("O numero e: " + numero);
            numero++;
        }
    }
}
