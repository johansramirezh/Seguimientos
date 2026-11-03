import java.util.ArrayList;
import java.util.Iterator;

public class listaEstudiantes {
     public static void main(String[] args) {

        ArrayList<String> listaDeNombresDeEstudiantes = new ArrayList<>();
        listaDeNombresDeEstudiantes.add("Andrea");
        listaDeNombresDeEstudiantes.add("Camilo");
        listaDeNombresDeEstudiantes.add("Julian");
        listaDeNombresDeEstudiantes.add("alejandro");
        listaDeNombresDeEstudiantes.add("Martin");
        listaDeNombresDeEstudiantes.add("Isabel");

        eliminarEstudiantesConLetraA(listaDeNombresDeEstudiantes);

        System.out.println(listaDeNombresDeEstudiantes);

    } 

    public static void eliminarEstudiantesConLetraA(ArrayList<String> listaDeNombresDeEstudiantes) {

        Iterator<String> iteradorDeNombres = listaDeNombresDeEstudiantes.iterator();

        while (iteradorDeNombres.hasNext()) {

            String nombreActual = iteradorDeNombres.next();

            char primeraLetra = nombreActual.charAt(0);

            if (primeraLetra == 'a' || primeraLetra == 'A') {
                iteradorDeNombres.remove(); 
            }

        } 

    } 

} 
    

