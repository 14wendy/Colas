package sample;

/**
 * Created by Wendy on 15/11/2017.
 */
public class Nodo {
    private int valor;
    private Nodo proximo; //Puntero hacia el siguiente nodo

    //Constructor simple, inicializa sin valor
    public Nodo(){
        this.valor=0;
        this.proximo=null;
    }
    //Constructor
    public Nodo(int valor){
        this.valor=valor;
        this.proximo=null;
    }
    public void setValor(int valor){
        this.valor=valor;
    }
    public void setProx(Nodo siguiente){
        this.proximo=siguiente;
    }
    public int getValor(){
        return this.valor;
    }
    public Nodo getProximo(){
        return this.proximo;
    }
}
