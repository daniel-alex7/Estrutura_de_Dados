import java.util.ArrayList;
import java.util.Arrays;

public class cidades {
   
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
        System.out.println("Cidades Atualizadas: " + cidades);
    }
}