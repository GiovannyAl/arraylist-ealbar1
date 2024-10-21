import java.util.ArrayList;
import java.util.Collections;

public class EjercicioOcho {
    public static void main(String[] args) {

        ArrayList<String> diasDeLaSemana = new ArrayList<>();
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miércoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sábado");
        diasDeLaSemana.add("Domingo");

        System.out.println("Lista original: " + diasDeLaSemana);

        Collections.reverse(diasDeLaSemana);

        System.out.println("Lista invertida: " + diasDeLaSemana);
    }
}