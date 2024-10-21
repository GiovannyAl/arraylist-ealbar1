import java.util.ArrayList;
import java.util.Collections;

public class EjercicioSeis {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Bogota");
        ciudades.add("Cali");
        ciudades.add("Valledupar");
        ciudades.add("Villavicencio");
        ciudades.add("Medellin");

        System.out.println("Lista antes de mezclar: " + ciudades);

        Collections.shuffle(ciudades);

        System.out.println("Lista después de mezclar: " + ciudades);
    }
}