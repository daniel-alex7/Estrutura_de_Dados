package A06_TAD;

//interface - vai ter expecificações, mas implementação é de outra forma.
//todas as classes TAD_PILHA tem essas expecificações 

public interface TAD_Pilha {
    public boolean isEmpty();
    public boolean isFull();
    public Object push(Object x);
    public Object pop();
    public Object top();
    public String toString();
}
