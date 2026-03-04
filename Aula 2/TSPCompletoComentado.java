

public class TSPCompletoComentado {
    static int N = 4; // Número de cidades
    static int[][] distancias = new int[N][N];
    static int menorCustoTotal = Integer.MAX_VALUE;
    static long rotasTestadas = 0;

    public static void main(String[] args) {
        // Inicializar a matriz de distâncias
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                distancias[i][j] = (i == j) ? 0 : (int) (Math.random() * 100 + 1);
            }
        }

        boolean[] visitadas = new boolean[N];
        visitadas[0] = true; // Começa na cidade 0

        long tempoInicio = System.nanoTime();
        procurar(0, 1,  0, visitadas);
        long tempoFim = System.nanoTime();

        double tempoMs = (tempoFim - tempoInicio) / 1_000_000.0;
        System.out.println("------Resultado-----");
        System.out.println("Melhor custo: " + menorCustoTotal);
        System.out.println("Rotas testadas: " + rotasTestadas);
        System.out.println("Tempo gasto: " + tempoMs + " ms");
    }

    public static void procurar(int atual, int cont, int custoAtual, boolean[] visitadas) {
        if (cont == N){
            rotasTestadas++;
            int custoFinal = custoAtual + distancias[atual][0];
            

            if (custoFinal < menorCustoTotal) menorCustoTotal = custoFinal;
                return;
        }

        for (int proxima = 0; proxima < N; proxima++){
            if (!visitadas[proxima]) {
                visitadas[proxima] = true;
                procurar(proxima, cont + 1, custoAtual + distancias[atual][proxima], visitadas);
                visitadas[proxima] = false;
                }
            }
        }

        }
    
