
// Ledón: programa no arquivo Maximo.java

public class Maximo {
	
    	public static void main(String args[]) {
		new Maximo();
    	}
	
    	public Maximo() {
		int a[] = {12, 11, 21, 89, 99, 45, 89, 12, 24, 6, 70, 1002, 999, 987};
		System.out.println( "Maior dos valores 1: " + maximoIterativo(a)); 
		System.out.println( "Maior dos valores 2: " + maximoIterativo(a) +
			maximoRecursivo(a, 0, a.length-1, 0));
    	}
	
	public int maximoRecursivo (int vet[], int inicio, int fim, int nivel) { // método recursivo
	    if(inicio == fim) return vet[inicio];
	    int meio = (inicio + fim) / 2;
	    int a = maximoRecursivo(vet, inicio, meio, ++nivel);
		int b = maximoRecursivo(vet, meio+1, fim, nivel);	
		System.out.println("Nível: " + nivel + ": " + a + " > " + b);
		return ( (a>b) ? a:b );
	 }
	 
	public int maximoIterativo (int vet[]) {
	        int max = vet[0];
	        for(int i=1; i < vet.length; i++) {
	              if(vet[i] > max) max = vet[i];
	        }
	        return max;
	 }
}

