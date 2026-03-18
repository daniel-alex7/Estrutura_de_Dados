import java.util.Scanner;
import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            System.out.print("Quantos valores vai digitar? ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                System.out.println("Informe um número inteiro positivo.");
            } else {
                System.out.println("Entrada inválida. Digite um inteiro.");
                sc.next();
            }
        }

        double[] valores = new double[n];
        double ultimo = Double.NEGATIVE_INFINITY;

        // Verificando valores digitados
        for (int i = 0; i < n; ) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            if (!sc.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite um número real.");
                sc.next();
                continue;
            }

            // aqui impede que valor digitado seja menor do que o ultimo valor digitado
            double v = sc.nextDouble();
            if (v < ultimo) {
                System.out.println("Valor menor que o último informado (último = " + ultimo + "). Digite outro valor.");
                continue;
            }
            valores[i] = v;
            ultimo = v;
            i++;
        }

        //print em valores que foram digitados

        System.out.println("Valores digitados: " + Arrays.toString(valores));
        System.out.println();

        //pesquisa iniciada

        System.out.print("Digite um número real para pesquisar: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número real.");
            sc.next();
        }
        double alvo = sc.nextDouble();
        sc.close();

        int pos = buscaBinaria(valores, alvo);
        if (pos != -1) {
            System.out.println("Número encontrado na posição (índice): " + pos);
        } else {
            System.out.println("Número NÃO encontrado na lista.");
        }
    }

    public static int buscaSequencial(double[] vetor, double valorPesquisado) {
        final double EPS = 1e-9;
        for (int i = 0; i < vetor.length; i++) {
            if (Math.abs(vetor[i] - valorPesquisado) < EPS) {
                return i;
            }
        }
        return -1;
    }

    //Utilizando a busca binária

    public static int buscaBinaria(double[] vetor, double valorPesquisado) {
        final double EPS = 1e-9;
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (Math.abs(vetor[meio] - valorPesquisado) < EPS) {
                return meio;
            }
            if (valorPesquisado < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }
}