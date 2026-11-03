
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// T solo puede ser Producto o una clase hija de Producto
public class Carrito<T extends Producto> implements Iterable<T> {

    private final String nombre;           // nombre del carrito
    private final List<T> listaProductos;  // la fila de cajas (conserva el orden)

    public Carrito(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<T> getListaProductos() {
        return Collections.unmodifiableCollection(listaProductos);
    }

   
    public void agregar(T t) {
        listaProductos.add(t);
    }

    // Devuelve el producto con el precio más alto
    public T obtenerProductoMayor() {
        if (listaProductos.isEmpty()) {
            throw new RuntimeException("No hay productos en el carro aun");
        }
        T mayor = listaProductos.get(0);             
        for (T t : listaProductos) {
            if (t.getPrecio() > mayor.getPrecio()) {
                mayor = t;                             // encontramos uno más caro
            }
        }
        return mayor;
    }

    // Suma los precios de todos los productos
    public double calcularPrecioTotal() {
        double total = 0;
        for (T p : listaProductos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public CarritoIterator<T> iterator() {
   
        return new CarritoIterator<>(new ArrayList<>(listaProductos));
    }
}