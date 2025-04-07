/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exlacosderepeticao;

/**
 *
 * @author CAMARGO
 */
public class Ex16LacosDeRepeticao {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c = 0;
        
        System.out.println(a);
        System.out.println(b);
        
        for(int i = 1; i <= 90; i++){
            c = a + b;
            a = b;
            b = c;
            
            System.out.println(c);
            
            if(c > 500){
                break;
            }
        }
    }
}
