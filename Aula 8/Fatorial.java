
//Led�n: Fatorial.java
//Recursividade em Java

public class Fatorial {
	
	public static void main(String args[]) {
		new Fatorial();
	}
	
	public Fatorial() {
		System.out.println( "fatorial(4): "  + fatorial (4) );
		System.out.println( "fatorial(5): "  + fatorial (5) );   
		System.out.println( "fatorial(10): " + fatorial (10) );   
	}

	public long fatorial ( int n ) {
	        long resposta = n;
			if (resposta < 0) return -1;
			else if (resposta == 0 || resposta == 1) return 1;
			for (int i = n - 1; i > 1; i--){
				resposta = resposta * i;
			}
			return resposta;
	} 

	public long calculoRecursivo(int n){
		if (n < 0) return -1;
		else if (n == 0 || n == 1) return 1;
		else return (n * calculoRecursivo(n-1));
	}


}