import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
   
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>(
            Arrays.asList("São Paulo", "Santos", "Ribeirão Preto")
        );
        

        System.out.println("Cidades antes de alterar: " + cidades);
        System.out.println();

        cidades.add(0, "Campinas"); 
        cidades.add(2, "Mirassol");    

        System.out.println("Cidade índice 2: " + cidades.get(2));
        System.out.println();
        System.out.println("Cidades: " + cidades);
        System.out.println();

        cidades.remove(1);

        System.out.println("Cidades Atualizadas sem índice 1: " + cidades);
        System.out.println();
        System.out.println("Cidades números: " + cidades.size());
        System.out.println();


        for(int i = 0; i < cidades.size(); i ++){
            System.out.println(cidades.get(i));
        }

        System.out.println();
        // Esse é melhor que o laço de cima: 
        System.out.println("Lista de cidades com Laço For-Each");
        for (String cidade: cidades){
            System.out.println(cidade);
        }

    }
}