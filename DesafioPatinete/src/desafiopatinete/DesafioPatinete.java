package desafiopatinete;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioPatinete {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[] notasAntonio = new int[4];
        int[] notasCharles = new int[4];

        // Lê as notas do Antonio
        for (int i = 0; i < 4; i++) {
            notasAntonio[i] = sc.nextInt();
        }

        // Lê as notas do Charles
        for (int i = 0; i < 4; i++) {
            notasCharles[i] = sc.nextInt();
        }

        // Junta os dois arrays
        int[] todasNotas = new int[8];
        System.arraycopy(notasAntonio, 0, todasNotas, 0, 4);
        System.arraycopy(notasCharles, 0, todasNotas, 4, 4);

        // Ordena o array combinado
        Arrays.sort(todasNotas);

        // Calcula a média (arredondada para baixo)
        int soma = 0;
        for (int nota : todasNotas) {
            soma += nota;
        }
        int media = soma / todasNotas.length; // divisão inteira já arredonda para baixo

        // Exibe o array
        System.out.print("[");
        for (int i = 0; i < todasNotas.length; i++) {
            System.out.print(todasNotas[i]);
            if (i < todasNotas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Exibe a média
        System.out.println(media);

        sc.close();
    }
    
}
