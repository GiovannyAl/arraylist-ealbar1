import java.util.ArrayList;

public class EjercicioNueve {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("uno");
        palabras.add("dos");
        palabras.add("uno");
        palabras.add("tres");
        palabras.add("uno");
        palabras.add("cuatro");
        palabras.add("dos");

        String palabraEspecifica = "uno";
        int cantidad = 0;

        for (String palabra : palabras) {
            if (palabra.equals(palabraEspecifica)) {
                cantidad++;
            }
        }

        System.out.println("La palabra \"" + palabraEspecifica + "\" aparece " + cantidad + " veces.");
    }
}