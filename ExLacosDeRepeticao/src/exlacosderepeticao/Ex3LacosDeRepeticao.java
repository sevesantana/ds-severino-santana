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

public class Ex3LacosDeRepeticao {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        
        float primeiro = scan.nextInt();
        
        float segundo = 0;
        
        for (int i = 1; i < 2; i++){
            System.out.println("Digite o segundo numero: ");
            
            float segundo2 = scan.nextInt();
            
            if(segundo2 == 0){
                System.out.println("Valor Invalido. Por favor digite um numero diferente de 0.");
                i--;
            }
            
            segundo = segundo2;
        }
            float divisao = primeiro/segundo;
        
            System.out.println("A divisao desses dois numeros: " + divisao);
        }
    }

