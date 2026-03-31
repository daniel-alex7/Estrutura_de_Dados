public class ordenacao2 {
    public static void main(String[] args) {
        new ordenacao2();
    }

    public ordenacao2() {
        int[] numeros = {5, 2 ,9, 1, 5, 6};
        System.out.println("Vetor desordenado:");
        visualizar(numeros);
        insertionSort(numeros);
        double[] notas = {10, 5.5, 3.8, 4.75, 9.99, 1, 0.5};
        System.out.println("Vetor desordenado - números decimais");
        visualizar(notas);
        insertionSort(notas);
        
    }

    public void visualizar(int[] vetor) {
        for (int n : vetor) System.out.print(n + " ");
        System.out.println();
    }

    public void visualizar(double[] vetor) {
        for (double d : vetor) System.out.print(d + " ");
        System.out.println();
    }

    // --- SOBRECARGA DO MÉTODO INSERTION SORT ---

    public void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public void insertionSort(double[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            double chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }
}

    //Muito parecido com o bubble sort

    // public void insertionSort(int[] vetor) {
    //     int numeroElementos = vetor.length;
    //     for (int i = 1; i < numeroElementos; i++) {
    //         int numeroEmOrdenacao = vetor[i];
    //         int j = i - 1;
    //         while (j >= 0 && vetor[j] > numeroEmOrdenacao) {
    //             vetor[j+1] = vetor[j];
    //             j--;
    //         }
    //         vetor[j+1] = numeroEmOrdenacao;
    //         visualizar(vetor);
    //     }
    // }

    // public void visualizar(int numeros[]) {
    //     for (int num: numeros) {
    //         System.out.print(num + "  ");
    //     }
    //     System.out.println();
    // }
 /*   public void visualizar(int numeros[]) {
        for (int index = 0; index < numeros.length; index++) {
            System.out.print(numeros[index] + "  ");
        }
        System.out.println();
    }
*/


