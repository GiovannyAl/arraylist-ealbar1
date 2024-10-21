import java.util.ArrayList;

public class EjercicioDiez {
    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Zebra");
        animales.add("Toruga");
        animales.add("Conejo");

        String animalEspecifico = "Gato";

        if (animales.contains(animalEspecifico)) {
            System.out.println("El animal \"" + animalEspecifico + "\" está en la lista.");
        } else {
            System.out.println("El animal \"" + animalEspecifico + "\" no está en la lista.");
        }
    }
}