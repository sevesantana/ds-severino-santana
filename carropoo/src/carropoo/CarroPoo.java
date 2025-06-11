package carropoo;

import Classe.Carro;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
            int r = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Ligar\n2 - Desligar\n3 - Acelerar\n4 - Frear\n5 - Exibir informacoes\n6 - Sair\nO que voce deseja fazer?", "Menu", JOptionPane.QUESTION_MESSAGE ));
            //System.out.println("1 - Ligar");
            //System.out.println("2 - Desligar");
            //System.out.println("3 - Acelerar");
            //System.out.println("4 - Frear");
            //System.out.println("5 - Exibir informacoes");
            //System.out.println("6 - Sair");
            //System.out.println("O que voce deseja fazer?");
        
            //resposta = scan.nextInt();
            
            resposta = r;
        
            switch(r){
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
                    JOptionPane.showMessageDialog(null, "Cor: " + carro1.getCor() + "\nMarca: " + carro1.getMarca() + "\nModelo: " + carro1.getModelo() + "\nAno: " + carro1.getAno() + "\nEstado: " + (carro1.isLigado() ? "Ligado" : "Desligado") + "\nVelocidade atual: " + carro1.getVelocidade() + "Km/h.", "Informacoes do carro", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opcao valida.");
            }
        } while (resposta != 6);
                
                
        
        
        
        
    }
    
}
