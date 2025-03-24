/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciojava;

/**
 *
 * @author snsf2
 */
public class Exercicio9Java {
    public static void main(String[]args){
        float totalEleitores = 150000;
        float totalValidos = 140000;
        float totalBrancos = 5000;
        float totalNulos = 5000;
        float porcentagemValidos = totalValidos/totalEleitores*100;
        float porcentagemBrancos = totalBrancos/totalEleitores*100;
        float porcentagemNulos = totalNulos/totalEleitores*100;
        
        System.out.println("O percentual de votos validos em 150000 eleitores e de: " + porcentagemValidos);
        System.out.println("O percentual de votos brancos em 150000 eleitores e de: " + porcentagemBrancos);
        System.out.println("O percentual de votos validos em 150000 eleitores e de: " + porcentagemNulos);
    }
    
}
