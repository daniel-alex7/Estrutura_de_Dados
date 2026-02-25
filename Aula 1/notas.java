import java.util.Scanner;

public class notas{
    public static void main(String[] args) {

        String[] materias = {"Matemática", "Geografia", "Português"}; 
        String[] alunos = new String[4];
        double notas[][] = new double[4][3];

        int x = 0;

        Scanner scan = new Scanner(System.in);

        while(x < 4) {
            System.out.println(x + 1 + "° Aluno");
            alunos[x] = scan.nextLine(); 
            

            for(int y = 0; y < materias.length; y++){
                System.out.println("Nota " + materias[y]);
                notas[x][y] = Double.valueOf(scan.nextLine());
            }
            x++;
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i]);

            for(int a = 0; a < materias.length; a++){
                System.out.println(materias[a] + ": " + notas[i][a]);}

                
  
        }
       
    

        
        


        



    }
}