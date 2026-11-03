public class SumaDivideYVenceras {
     public static void main(String[] args) {

        int[] arreglo = {3, 4, 2, 6, 5};

        int resultado = sumarDivideYVenceras(arreglo, 0, arreglo.length - 1);

        System.out.println("La suma total del arreglo es: " + resultado);

    }

    public static int sumarDivideYVenceras(int[] arreglo, int inicio, int fin) {

    
        if (inicio == fin) {
            return arreglo[inicio];
        } 

        int medio = (inicio + fin) / 2;

        int sumaIzquierda = sumarDivideYVenceras(arreglo, inicio, medio);

        int sumaDerecha = sumarDivideYVenceras(arreglo, medio + 1, fin);

        return sumaIzquierda + sumaDerecha;

    } 

} 
