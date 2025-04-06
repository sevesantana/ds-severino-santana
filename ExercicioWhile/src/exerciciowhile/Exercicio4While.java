/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciowhile;

/**
 *
 * @author snsf2
 */
import java.util.Scanner;

public class Exercicio4While {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ha quantos alunos na sala de aula? ");
        
        int alunos = scan.nextInt();
        
        double totalNotas = 0;
        
        for (int aluno = 1; aluno <= alunos; aluno++)
        {
            System.out.println("Qual a nota do aluno numero " + aluno + "? ");
            
            double nota = scan.nextDouble();
            
            totalNotas = totalNotas+nota;
        }
        
        double media = totalNotas/alunos;
        
        System.out.println("A media aritmetica da turma e de: " + media);
    }
}
