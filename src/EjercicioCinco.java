import java.util.ArrayList;

public class EjercicioCinco {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        Integer[] arrayNumeros = new Integer[numeros.size()];
        arrayNumeros = numeros.toArray(arrayNumeros);

        System.out.println("Contenido del array:");
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(arrayNumeros[i]);
        }
    }
}
