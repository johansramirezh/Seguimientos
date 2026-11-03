package Pila;

public class Pila<T> {
 
    private int size;
    private Nodo<T> cima;
 
    public Pila() {
        size = 0;
        cima = null;
    }
 
    public boolean estaVacia() {
        return cima == null;
    }
 
    public void limpiarPila() {
        cima = null;
        size = 0;
    }
 
    public void apilar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        if (estaVacia()) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
        size++;
    }
 
    public T desapilar() {
        if (cima == null) {
            throw new RuntimeException("NO hay elemntos en la pila");
        } else {
            T data = cima.getDato();
            cima = cima.getSiguiente();
            size--;
            return data;
        }
    }
 
   
   public void addPila(Pila<T> combinada) {
    Pila<T> pilas = new Pila<>();

    Nodo<T> actual = combinada.cima;

    while (actual != null) {
        pilas.apilar(actual.getDato());
        actual = actual.getSiguiente();
    }

    while (!pilas.estaVacia()) {
        this.apilar(pilas.desapilar());
    }
}
 
    public void imprimir() {
        for (Nodo<T> actual = cima; actual != null; actual = actual.getSiguiente()) {
            System.out.print(actual.getDato() + " ");
        }
        System.out.println();
    }

    public Pila<T> clone(){
        Pila<T> clone = new Pila <>();
        return clone;
    }
    
    
}

