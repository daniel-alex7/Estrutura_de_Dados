import java.util.Scanner;

public class notas{
    public static void main(String[] args) {

        String[] materias = {"Matemática", "Geografia"}; 
        String[] alunos = new String[4];
        double notas[][] = new double[4][2];

        int x = 0;

        Scanner scan = new Scanner(System.in);

        while(x < 4) {
            System.out.println(x + 1 + "° Aluno");
            alunos[x] = scan.nextLine(); 
            x++;
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i]);
        }
        

        



    }
}