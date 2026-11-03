public class matrushka {

    public static void main(String[] args) {
        int cantidadmatriuskas=5;

        abrir_y_cerrar_matriuskas(1, cantidadmatriuskas);
    }

    public static void abrir_y_cerrar_matriuskas(int matriuskaInicial,int totalmatriuska){

        if (matriuskaInicial > totalmatriuska){
            return;
        }
        System.out.println("Abriendo la matriuska #: " + matriuskaInicial);

        abrir_y_cerrar_matriuskas(matriuskaInicial +1, totalmatriuska);

        System.out.println("Cerrando la matriuske #:" + matriuskaInicial);
    }
    }
    

