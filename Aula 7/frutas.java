
public class frutas {
    public static void main(String[] args) {
        String frutas1 = "morango";
        String frutas2 = "Melão";
        if (frutas1.compareTo(frutas2) > 0) {
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

        char a = 'C'; 
        char b = 'a';

        if (a > b) System.out.println(b + " vem primeiro, depois " + a);
        else if (a < b) System.out.println(a + " vem primeiro, depois " + b);
        else System.out.println("Os caracteres são iguais");
    }
}


