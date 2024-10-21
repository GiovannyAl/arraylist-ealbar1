import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EjercicioSiete {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Lista original: " + numeros);

        Set<Integer> sinDuplicados = new HashSet<>(numeros);

        System.out.println("Conjunto sin duplicados: " + sinDuplicados);
    }
}