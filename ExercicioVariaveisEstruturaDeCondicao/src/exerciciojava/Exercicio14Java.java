/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojava;

/**
 *
 * @author snsf2
 */
public class Exercicio14Java {
    public static void main(String[]args){
        int alcoolUm = 18;
        
        if (alcoolUm < 20) {
            float preco = 2.90f;
            float precoFinal = alcoolUm*(preco-(3*2.90f/100f));
            System.out.println("O preco final de " + alcoolUm + "L de alcool foi de R$" + precoFinal);
        } else {
            float preco = 2.90f;
            float precoFinal = alcoolUm*(preco-(5*2.90f/100f));
            System.out.println("O preco final de " + alcoolUm + "L de alcool foi de R$" + precoFinal);
        }
        
        int alcoolDois = 35;
        if (alcoolDois < 20) {
            float preco = 2.90f;
            float precoFinal = alcoolDois*(preco-(3*2.90f/100f));
            System.out.println("O preco final de " + alcoolDois + "L de alcool foi de R$" + precoFinal);
        } else {
            float preco = 2.90f;
            float precoFinal = alcoolDois*(preco-(5*2.90f/100f));
            System.out.println("O preco final de " + alcoolDois + "L de alcool foi de R$" + precoFinal);
        }
        
        int gasolinaUm = 11;
        if (gasolinaUm < 20) {
            float preco = 3.30f;
            float precoFinal = gasolinaUm*(preco-(4*3.30f/100f));
            System.out.println("O preco final de " + gasolinaUm + "L de gasolina foi de R$" + precoFinal);
        } else {
            float preco = 3.30f;
            float precoFinal = gasolinaUm*(preco-(6*2.90f/100f));
            System.out.println("O preco final de " + gasolinaUm + "L de gasolina foi de R$" + precoFinal);
        }
       
        int gasolinaDois = 45;
        if (gasolinaDois < 20) {
            float preco = 3.30f;
            float precoFinal = gasolinaDois*(preco-(4*3.30f/100f));
            System.out.println("O preco final de " + gasolinaDois + "L de gasolina foi de R$" + precoFinal);
        } else {
            float preco = 3.30f;
            float precoFinal = gasolinaDois*(preco-(6*3.30f/100f));
            System.out.println("O preco final de " + gasolinaDois + "L de gasolina foi de R$" + precoFinal);
        }
    }
    
}
