import java.util.Scanner;

public class Exercicio1Corre {
    public static void main(String[] args) {
        double valoresDigitados[] = receberValores();
    }

    public static double[] receberValores(){
        Scanner teclado = new Scanner(System.in);

        int qtdValores;

        System.out.println("Informe quantos valores deseja digitar: ");
        qtdValores = teclado.nextInt();

        double valores[] = new double[qtdValores];
        double numero;

        for(int i = 0; i < qtdValores; i ++){
            System.out.println("Digite o "+ (i+1) + "° valor: ");
            numero = teclado.nextDouble();

            if (i == 0){
                valores[i] = numero;

            }else if (numero >= valores[i-1]){
                valores[i] = numero;
            }else{
                System.out.println("Digite o valor maior que: " + valores[i-1]);
                i--;
            }
        }

    }
    
}
