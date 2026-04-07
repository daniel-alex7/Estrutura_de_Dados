
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
	        long resposta =  n;
			for(int i = n - 1; i > 0; i--){
				resposta = resposta * i;
			}
			return resposta;
	} 


}