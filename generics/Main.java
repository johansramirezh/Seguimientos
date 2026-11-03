

public class Main {

    public static void main(String[] args) {

        // Primer carrito
        Carrito<Producto> carrito = new Carrito<>("C2");
        carrito.agregar(new Producto("Iphone", 5300000, "Celular"));
        carrito.agregar(new Producto("Samsung", 4400000, "Celular"));
        carrito.agregar(new Producto("Motorola", 1200000, "Celular"));
        carrito.agregar(new Producto("HP", 7200000, "Computador"));
        carrito.agregar(new Producto("Lenovo", 3800000, "Computador"));

      
        CarritoIterator<Producto> it0 = carrito.iterator();
        while (it0.hasNext()) {
            System.out.println(it0.next());
        }

      System.out.println("\n Categoria Celulares");
        CarritoIterator<Producto> it1 = carrito.iterator();
        while (it1.hasNextCategoria("Celular")) {
            System.out.println(it1.nextCategoria("Celular"));
        }

        System.out.println("\n Categoria Computadores");
        CarritoIterator<Producto> it2 = carrito.iterator();   // iterador
        while (it2.hasNextCategoria("Computador")) {
            System.out.println(it2.nextCategoria("Computador"));
        }

        // Carrito pichurria
        System.out.println("\n " + carrito.getNombre() +"");
        System.out.println("Mas caro: " + carrito.obtenerProductoMayor());
        System.out.println("Total: " + carrito.calcularPrecioTotal());

       
    }
}