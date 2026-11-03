

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarritoIterator<T extends Producto> implements Iterator<T> {

    private final List<T> lista;
    private int indice = 0;          
    private int indiceCategoria = 0;  
    public CarritoIterator(List<T> lista) {
        this.lista = lista;
    }

    
    @Override
    public boolean hasNext() {
        return indice < lista.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay elementos");
        }
        return lista.get(indice++);
    }

    // Iteracion propia
    public boolean hasNextCategoria(String categoria) {
        for (int i = indiceCategoria; i < lista.size(); i++) {
            if (lista.get(i).getCategoria().equalsIgnoreCase(categoria)) {
                return true;  
            }
        }
        return false;       
    }

    public T nextCategoria(String categoria) {
        for (int i = indiceCategoria; i < lista.size(); i++) {
            if (lista.get(i).getCategoria().equalsIgnoreCase(categoria)) {
                indiceCategoria = i + 1; 
                return lista.get(i);
            }
        }
        throw new NoSuchElementException("No hay elementos de la categoría " + categoria);
    }
}