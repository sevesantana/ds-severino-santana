package desafiovacina;

import java.util.Scanner;

public class DesafioVacina {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        // Lê o tamanho do arranjo
        int N = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        String[] genes = new String[N];

        // Lê os N genes
        for (int i = 0; i < N; i++) {
            genes[i] = sc.nextLine();
        }

        // Lê o gene a ser analisado
        String alvo = sc.nextLine();

        // Conta ocorrências
        int contagem = 0;
        for (String g : genes) {
            if (g.equals(alvo)) {
                contagem++;
            }
        }

        // Exibe resultado
        if (contagem > 1) {
            System.out.println("Achei o danado");
        } else if (contagem == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Sumiuu!");
        }

        sc.close();   
    }
    
}
