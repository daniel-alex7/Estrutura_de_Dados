package Aula10;

public class PilhaEncadeada {
    
    private class Node {
        public Object valor;
        public Node proximo;

        public Node(Object valor){
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Node topo;
    private int tamanho;

    // Criando construtor da pilha
    public PilhaEncadeada(){
        this.topo = null;
        this.tamanho = 0;
    }

    //Inserindo na pilha
    public void push(Object valor){
        if(valor == null){
            throw new IllegalArgumentException("Não é permitido dado nulo"); //Uso indevido do argumento
        }
        Node novoNode = new Node(valor);
        System.out.println("Nó atual "+ novoNode.valor + " / anterior: " + topo);
        novoNode.proximo = topo;
        topo = novoNode;
        tamanho ++;
    }

    //criando pop 
    public Object pop(){
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        Object valorTopo = topo.valor;
        topo = topo.proximo; //o topo é o próximo a seguir
        tamanho --; // dimnui a pilha em uma casa
        return valorTopo;
    }

    public Object peek(){
        if (isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }
        return topo.valor;
    }
    public boolean isEmpty(){
        return topo == null;
    }
    public int size() {
        return tamanho;
    }

    public void clear () {
        topo = null;
        tamanho = 0;
    }

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.push("Maçã");
        pilha.push("Manga");
        pilha.push("Uva");
        System.out.println("Conteúdo da pilha: ");
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Tamanho: " + pilha.size());
        System.out.println("Tamanho: " + pilha.size());
        while(!pilha.isEmpty()) {
            System.out.println("Retirando o item: " + pilha.pop());
        }
    }
}

