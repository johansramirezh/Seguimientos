public class SumaMayoresQue {
      public static void main(String[] args) {

        int[] Numeros = {3, 8, 7, 2, 9, 4, 6};
        int NumeroMayor = 5;
        int sumaTotal = sumarMayoresQue(Numeros, NumeroMayor, 0);

        System.out.println("La suma de los numeros mayores a " + NumeroMayor + " es: " + sumaTotal);

    }
     
    public static int sumarMayoresQue(int[] Numeros, int NumeroMayor, int n) {

        if (n == Numeros.length) {
            return 0;
        } 

        int sumaDelResto = sumarMayoresQue(Numeros, NumeroMayor, n + 1);

        if (Numeros[n] > NumeroMayor) {
            return Numeros[n] + sumaDelResto;
        } else {
            return sumaDelResto;
        } 
    } 
} 