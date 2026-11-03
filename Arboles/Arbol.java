package Arboles;

public class Arbol<T> {
    private NodoArbol<T> raiz;
    private int peso;

    public Arbol() {
        peso = 0;
        raiz = null;
    }

    public NodoArbol<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol<T> raiz) {
        this.raiz = raiz;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void inorden() {
        inorden(raiz);
    }

    private void inorden(NodoArbol<T> raizAux) {
        if (raizAux == null) {
            return;
        }
        inorden(raizAux.getHijoIzquierdo());
        System.out.println(raizAux.getElemento());
        inorden(raizAux.getHijoDerecho());
    }

    public void preorden() {
        preorden(raiz);
    }

    private void preorden(NodoArbol<T> raizAux) {
        if (raizAux == null) {
            return;
        }
        System.out.println(raizAux.getElemento());
        preorden(raizAux.getHijoIzquierdo());
        preorden(raizAux.getHijoDerecho());
    }

    public void postorden() {
        postorden(raiz);
    }

    private void postorden(NodoArbol<T> raizAux) {
        if (raizAux == null) {
            return;
        }
        postorden(raizAux.getHijoIzquierdo());
        postorden(raizAux.getHijoDerecho());
        System.out.println(raizAux.getElemento());
    }

    public int obtenerPeso() {
        return obtenerPeso(raiz);
    }

    private int obtenerPeso(NodoArbol<T> raizAux) {
        if (raizAux == null) {
            return 0;
        }
        return 1 + obtenerPeso(raizAux.getHijoIzquierdo()) + obtenerPeso(raizAux.getHijoDerecho());
    }

    public int calcularAltura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(NodoArbol<T> raizAux) {
        if (raizAux == null) {
            return 0;
        }
        int alturaIzquierda = 1 + calcularAltura(raizAux.getHijoIzquierdo());
        int alturaDerecha = 1 + calcularAltura(raizAux.getHijoDerecho());

        if (alturaIzquierda > alturaDerecha) {
            return alturaIzquierda;
        } else {
            return alturaDerecha;
        }
    }

    public boolean existe(T elemento) {
        return existe(raiz, elemento);
    }

    private boolean existe(NodoArbol<T> raizAux, T elemento) {
        if (raizAux == null) {
            return false;
        }
        if (raizAux.getElemento().equals(elemento)) {
            return true;
        }
        boolean existeIzquierda = existe(raizAux.getHijoIzquierdo(), elemento);
        if (existeIzquierda) {
            return true;
        }
        boolean existeDerecha = existe(raizAux.getHijoDerecho(), elemento);
        if (existeDerecha) {
            return true;
        }
        return false;
    }

    public int calcularAmplitud() {
        int amplitudMaxima = 0;
        int nivel = 1;
        int nodosEnNivel = contarNivel(raiz, nivel);

        while (nodosEnNivel > 0) {
            if (nodosEnNivel > amplitudMaxima) {
                amplitudMaxima = nodosEnNivel;
            }
            nivel++;
            nodosEnNivel = contarNivel(raiz, nivel);
        }
        return amplitudMaxima;
    }

    private int contarNivel(NodoArbol<T> raizAux, int nivel) {
        if (raizAux == null) {
            return 0;
        }
        if (nivel == 1) {
            return 1;
        }
        int nivelIzquierda = contarNivel(raizAux.getHijoIzquierdo(), nivel - 1);
        int nivelDerecha = contarNivel(raizAux.getHijoDerecho(), nivel - 1);

        return nivelIzquierda + nivelDerecha;
    }
}
