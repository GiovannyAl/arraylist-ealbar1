import java.util.ArrayList;
public class EjercicioUno {
    public static void main(String[] args) {

                ArrayList<String> fruits = new ArrayList<>();

                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Cherry");

                System.out.println("Tamaño de la lista: " + fruits.size());
                System.out.println("Elementos de la lista: " + fruits);

                // Eliminar "Banana" de la lista
                fruits.remove(1);
                // o tambien
                // fruits.remove("Banana");

                // Cambiar el valor de "Cherry" por "Orange"
                fruits.set(1, "Orange");

                // o tambien
                // int fruta = fruits.indexOf("Cherry");
                // if (fruta != -1) {
                //   fruits.set(fruta, "Orange");
                //}
                System.out.println("Lista resultante: " + fruits);
    }
}
