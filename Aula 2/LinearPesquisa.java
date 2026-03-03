public class LinearPesquisa {

    public static void main(String[] args) {
       int[] numeros = {1, 2, 3, 4, 5};
       int alvo = 4;


       for (int i = 0; i < numeros.length; i++) {
           System.out.println("Testando posição "+ i);

           if (numeros[i] == alvo) {
               System.out.println("Elemento encontrado na posição: " + i);
               break;
           }
       }
    }
}

