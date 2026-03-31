// Programa para gerar lista de compras do supermercado
/*
 * 1) crie um vetor lista para receber até 20 itens
 * 2) solicite o nome de um item para comprar no mercado
 * 3) verifique se o item já está na lista, se já estiver rejeite
 * 4) senão insira o item na lista e a ordene
 * 5) exiba a lista ordenada
 * 6) depois de 10 itens digitados, a cada novo item pergunte se deseja 
 *    acrescentar um novo item, se sim continue rodando o programa
 * 7) se chegar a 20 itens ou for informado que deseja parar,
 *    encerre o programa exibindo a lista final
 */

import java.util.Scanner;

public class GerenciadorCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lista = new String[20];
        int totalItens = 0;
        boolean continuar = true;

        System.out.println("--- Lista de compras ---");

        while (continuar && totalItens < 20) {
            String novoItem = lerEntrada(scanner);

            // A Busca Binária só funciona em listas ordenadas. 
            // Como ordenamos a cada inserção, ela é eficiente aqui.
            if (buscaBinaria(lista, totalItens, novoItem) != -1) {
                System.out.println("Erro: O item '" + novoItem + "' já está na lista!");
            } else {
                lista[totalItens] = novoItem;
                totalItens++;
                bubbleSort(lista, totalItens);
                System.out.println("Item adicionado com sucesso.");
            }

            exibirLista(lista, totalItens);

            if (totalItens >= 10 && totalItens < 20) {
                System.out.print("\nDeseja acrescentar outro item? (S/N): ");
                if (scanner.nextLine().equalsIgnoreCase("N")) {
                    continuar = false;
                }
            }
        }

        System.out.println("\n--- LISTA FINAL ---");
        exibirLista(lista, totalItens);
        scanner.close();
    }

    // 1. Método para Entrada de Dados
    public static String lerEntrada(Scanner sc) {
        System.out.print("\nInforme o item para compra: ");
        return sc.nextLine().trim();
    }

    // 2. Método de Ordenação (Bubble Sort)
    public static void bubbleSort(String[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j].compareToIgnoreCase(vetor[j + 1]) > 0) {
                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // 3. Método de Pesquisa (Busca Binária)
    public static int buscaBinaria(String[] vetor, int tamanho, String alvo) {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = alvo.compareToIgnoreCase(vetor[meio]);

            if (comparacao == 0) {
                return meio; 
            } else if (comparacao > 0) {
                inicio = meio + 1; 
            } else {
                fim = meio - 1; 
            }
        }
        return -1; 
    }

    
    public static void exibirLista(String[] vetor, int tamanho) {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Itens atuais:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }
}