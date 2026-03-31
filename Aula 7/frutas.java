
public class frutas {
    public static void main(String[] args) {
        String frutas1 = "morango";
        String frutas2 = "Melão";
        if (frutas1.compareTo(frutas2) > 0) {
            /* > 0 - primeira string > segunda string
             * = 0 - strings iguais
             * < 0 - primeira string < segunda string
             */
            System.out.println(frutas1 + " > " + frutas2);
        } else if (frutas1.compareTo(frutas2) < 0) {
            System.out.println(frutas1 + " < " + frutas2);
        } else {
            System.out.println(frutas1 + " == " + frutas2);
        }
        System.out.println(frutas1.compareTo(frutas2));
        System.out.println(frutas1.compareTo(frutas1));
        System.out.println(frutas2.compareTo(frutas1));

        // corrigido: verifica igualdade corretamente
        if (frutas1.equals(frutas2)) {
            System.out.println("frutas iguais");
        } else {
            System.out.println("frutas diferentes");
        }
    }
}
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


