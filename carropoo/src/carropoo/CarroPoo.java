package carropoo;

import Classe.Carro;
import java.util.Scanner;

public class CarroPoo {

    public static void main(String[] args) {        
        
        Scanner scan = new Scanner(System.in);
        int resposta;
        
        Carro carro1 = new Carro();
        carro1.setCor("Preto");
        carro1.setMarca("Renault");
        carro1.setModelo("Kwid");
        carro1.setAno(2015);
        carro1.setLigado(false);
        carro1.setVelocidade(0);            
        
        do{
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Frear");
        System.out.println("5 - Exibir informacoes");
        System.out.println("6 - Sair");
        System.out.println("O que voce deseja fazer?");
        
        resposta = scan.nextInt();
        
        switch(resposta){
            case 1:
                carro1.ligar();
                break;
            case 2:
                carro1.desligar();
                break;
            case 3:
                carro1.acelerar();
                break;
            case 4:
                carro1.frear();
                break;
            case 5:
                System.out.println("----- Informacoes do carro -----");
                System.out.println("Cor: " + carro1.getCor());
                System.out.println("Marca: " + carro1.getMarca());
                System.out.println("Modelo: " + carro1.getModelo());
                System.out.println("Ano: " + carro1.getAno());
                System.out.println("Estado: " + (carro1.isLigado() ? "Ligado" : "Desligado"));
                System.out.println("Velocidade: " + carro1.getVelocidade());
                System.out.println("-----");
                break;
            case 6:
                System.out.println("-----");
                System.out.println("Saindo do programa...");
                System.out.println("-----");
                break;
            default:
                System.out.println("-----");
                System.out.println("Escolha uma opcao valida.");
                System.out.println("-----");
        }
        } while (resposta != 6);
                
                
        
        
        
        
    }
    
}
