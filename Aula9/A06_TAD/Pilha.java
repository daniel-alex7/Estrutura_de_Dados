package A06_TAD;

//Implements TAD_PILHA

public class Pilha implements TAD_Pilha {

    private int topo;	//Topo da Pilha - Saber ultimo que entrou pois é o primeiro que vai sair
    private int MAX;	//Tamanho da Pilha
    private Object memo[];	//Elementos da Pilha (objeto genérico) --> serve para dados extremamente abstrato 

    //Método construtor que inicializa a Pilha no estado vazia
    public Pilha() {
        topo = -1; // o 0 é uma posição de mmeória o -1 não
        MAX = 30; 
        memo = new Object[MAX]; //Observa se está batendo número máximo ou não
    }

    //Método construtor que inicializa a Pilha com tamanho máximo desejado
    public Pilha(int qtde) {
        topo = -1; 
        MAX = qtde;
        memo = new Object[MAX];
    }

    //Método que verifica se a Pilha está Vazia
    public boolean isEmpty() {
        return (topo == -1);
    }

    //Método que verifica se a Pilha está cheia
    public boolean isFull() {
        return (topo == MAX - 1);
    }

    //Método para inserir um valor na Pilha
    public Object push(Object x) {
        if (!isFull()) {
            memo[++topo] = x;
            return x;
        } else {
            return null;
        }
    }

    //Método para retornar o conteúdo da Pilha
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += "\n  " + memo[i].toString();
                //if(i != topo) msg += ", ";
            }
            return ("P: [ " + msg + "\n]");
        } else {
            return "Pilha Vazia!";
        }
    }

    //Método para retornar o topo da Pilha e removê-lo
    public Object pop() {
        if (!isEmpty()) {
            return memo[topo--];
        } else {
            return null;
        }
    }

    //Método que retorna o topo da pilha sem removê-lo
    public Object top() {
        if (!isEmpty()) {
            return memo[topo];
        } else {
            return null;
        }
    }

//////////////////////////////////////////////////////
	//Método para exibir o conteúdo da Pilha
	public void print()
	{
		if(!isEmpty())
		{
			String msg = "";
			for(int i=0; i<=topo; i++)
			{
				msg += memo[i].toString() + ", ";
			}
			System.out.println("P: [ "+msg+" ]");
		}
		else
		{
			System.out.println("Pilha Vazia!!");
		}
	}


}
