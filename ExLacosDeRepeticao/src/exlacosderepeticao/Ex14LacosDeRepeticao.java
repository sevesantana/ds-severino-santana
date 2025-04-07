/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exlacosderepeticao;

/**
 *
 * @author snsf2
 */
public class Ex14LacosDeRepeticao {
    public static void main(String[] args){
        double a = 80000;
        double b = 200000;
        int i = 0;
        
        for(int i2 = 1; i2 < 1000; i2++){
            a = a+(a*3/100);
            b = b+(b*1.5/100);
            
            if(a>b){
                break;
            }
            i = i2;
        }
        System.out.println("O numero de anos que demorou para o pais A passar o pais B foi: "+ i + " anos.");
    }
}
