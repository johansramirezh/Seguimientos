
public class Producto {

    private String nombre;     // cómo se llama
    private double precio;     // cuánto cuesta
    private String categoria;  // a qué grupo pertenece: "Fruta", "Moto", "Ropa"...

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return nombre + " - " + precio + " - " + categoria;
    }
}