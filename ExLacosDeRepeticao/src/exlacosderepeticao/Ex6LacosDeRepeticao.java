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

public class Ex6LacosDeRepeticao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        float primeira = 0;
        float segunda = 0;
        
        for (int i = 1; i < 2; i++){
            System.out.println("Digite a primeira nota: ");
            
            float primeira2 = scan.nextFloat();
            
            if(primeira2 > 10){
                System.out.println("Valor invalido. Digite notas de 0 a 10.");
                i--;
            }
            
            primeira = primeira2;
        }
        for (int j = 1; j < 2; j++){
            System.out.println("Digite a segunda nota: ");
            
            float segunda2 = scan.nextFloat();
            
            if(segunda2 > 10){
                System.out.println("Valor invalido. Digite notas de 0 a 10.");
                j--;
            }
            
            segunda = segunda2;
        }
        float soma = primeira+segunda;
        float media = soma/2;
        
        System.out.println("A media do aluno e de: "+ media);
        
    }
}
