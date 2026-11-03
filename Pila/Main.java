package Pila;

public class Main {
 
    public static void main(String[] args) {
 
        Pila<Integer> pila = new Pila<>();
        pila.apilar(6);
        pila.apilar(5);
        pila.apilar(4);
        pila.apilar(3);
        pila.apilar(2);
         pila.apilar(1);
 
        Pila<Integer> pila2 = new Pila<>();
        pila2.apilar(3);
        pila2.apilar(7);
        pila2.apilar(2);
 
        pila.addPila(pila2);
 
        pila.imprimir(); 
        pila2.imprimir();  
    }
}