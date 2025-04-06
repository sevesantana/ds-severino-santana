/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exlacosderepeticao;

/**
 *
 * @author snsf2
 */
import java.util.Scanner;

public class ExLacosDeRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        
        float primeiro = scan.nextInt();
        
        float segundo = 0;
        
        for (int i = 1; i < 2; i++){
            System.out.println("Digite o segundo numero: ");
            
            float segundo2 = scan.nextInt();
            
            if(segundo2 == 0){
                i--;
            }
            
            segundo = segundo2;
        }
            float divisao = primeiro/segundo;
        
            System.out.println("A divisao desses dois numeros: " + divisao);
        }
}
    
