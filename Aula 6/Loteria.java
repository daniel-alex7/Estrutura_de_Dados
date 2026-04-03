import java.util.Scanner;
import java.util.Random;

public class Loteria {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        
        String[] nomes = new String[10];
        int[][] matrizApostas = new int[10][4];
        int[] sorteados = new int[3];
        int[] indicesGanhadores = new int[10];
        int totalGanhadores = 0;

        // Leitura dos dados
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do apostador " + (i + 1) + ": ");
            nomes[i] = scan.nextLine();

            System.out.println("Informe 4 números (0 a 9):");
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor " + (j + 1) + ": ");
                matrizApostas[i][j] = scan.nextInt();
            }
            scan.nextLine();
            System.out.println("--------------------");
        }

        // Sorteio dos 3 números
        System.out.print("\n>>> NÚMEROS SORTEADOS: ");
        for (int i = 0; i < 3; i++) {
            sorteados[i] = gerador.nextInt(10);
            System.out.print(sorteados[i] + " ");
        }

       
        for (int i = 0; i < 10; i++) {
            int contAcertos = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    if (matrizApostas[i][j] == sorteados[k]) {
                        contAcertos++;
                        break; 
                    }
                }
            }

            if (contAcertos >= 2) {
                indicesGanhadores[totalGanhadores] = i;
                totalGanhadores++;
            }
        }

        
        if (totalGanhadores > 0) {
            double premioIndividual = 1000000.0 / totalGanhadores;
            System.out.println("\n--- RESULTADO FINAL ---");
            for (int i = 0; i < totalGanhadores; i++) {
                int pos = indicesGanhadores[i];
                System.out.println("Ganhador: " + nomes[pos]);
                System.out.print("Números da aposta: ");
                for (int n = 0; n < 4; n++) {
                    System.out.print(matrizApostas[pos][n] + " ");
                }
                System.out.printf("\nPrêmio: R$ %.2f\n", premioIndividual);
                System.out.println("......................");
            }
        } else {
            System.out.println("\nNão houve ganhadores nesta rodada.");
        }

       
    }
}