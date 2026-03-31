import java.util.Scanner;
import java.util.Random;

public class Loteria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] apostadores = new String[10];
        int[][] apostas = new int[10][4];

        // Cadastro
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do apostador: ");
            apostadores[i] = sc.nextLine();

            System.out.println("Digite 4 números entre 0 e 9:");
            for (int j = 0; j < 4; j++) {
                System.out.print("Número " + (j + 1) + ": ");
                apostas[i][j] = sc.nextInt();
            }
            sc.nextLine(); // limpar buffer
        }

        
        int[] sorteio = new int[3];
        System.out.print("\nNúmeros sorteados: ");
        for (int i = 0; i < 3; i++) {
            sorteio[i] = rand.nextInt(10);
            System.out.print(sorteio[i] + " ");
        }

        
        int[] ganhadores = new int[10];
        int qtdGanhadores = 0;

        for (int i = 0; i < 10; i++) {
            int acertos = 0;

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    if (apostas[i][j] == sorteio[k]) {
                        acertos++;
                    }
                }
            }

            if (acertos >= 2) {
                ganhadores[qtdGanhadores] = i;
                qtdGanhadores++;
            }
        }

        
        if (qtdGanhadores > 0) {
            double premio = 1000000.0 / qtdGanhadores;

            System.out.println("\n\nGanhadores:");
            for (int i = 0; i < qtdGanhadores; i++) {
                int indice = ganhadores[i];

                System.out.println("Nome: " + apostadores[indice]);

                System.out.print("Aposta: ");
                for (int j = 0; j < 4; j++) {
                    System.out.print(apostas[indice][j] + " ");
                }

                System.out.println("\nValor ganho: R$ " + premio);
                System.out.println("----------------------");
            }

        } else {
            System.out.println("\nNenhum ganhador.");
        }

        
    }
}