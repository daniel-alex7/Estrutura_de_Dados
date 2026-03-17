public class Buscas {
    public static void main(String[] args) {
        double[] vetorDesordenado = { 2, 5, 4, 6, 3, 4, 6, 7, 1.2, 4.2 };
        int pos = buscaSequencial(vetorDesordenado, 2.4);
        System.out.println("Localizado na posição (indice): " + pos);
    }

    public static int buscaSequencial(double[] vetor, double valorPesquisado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorPesquisado){
                return i;
            } 
        }

        return -1;
    
    }

}
