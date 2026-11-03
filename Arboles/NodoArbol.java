package Arboles;

public class NodoArbol<T> {
    private T elemento;
    private NodoArbol<T> hijoIzquierdo;

   private NodoArbol<T> hijoDerecho;

 private NodoArbol<T> padre;

 public T getElemento() {
    return elemento;
 }

 public void setElemento(T elemento) {
    this.elemento = elemento;
 }

 public NodoArbol<T> getHijoIzquierdo() {
    return hijoIzquierdo;
 }

 public void setHijoIzquierdo(NodoArbol<T> hijoIzquierdo) {
    this.hijoIzquierdo = hijoIzquierdo;
 }

 public NodoArbol<T> getHijoDerecho() {
    return hijoDerecho;
 }

 public void setHijoDerecho(NodoArbol<T> hijoDerecho) {
    this.hijoDerecho = hijoDerecho;
 }

 public NodoArbol<T> getPadre() {
    return padre;
 }

 public void setPadre(NodoArbol<T> padre) {
    this.padre = padre;
 }

}