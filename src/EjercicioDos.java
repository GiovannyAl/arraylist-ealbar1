import java.util.ArrayList;

public class EjercicioDos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        System.out.println("Usando for:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println("Usando for-each:");
        for (int numbero : numeros) {
            System.out.println(numbero);
        }

        System.out.println("Usando while (orden inverso):");
        int tamanio = numeros.size() - 1;
        while (tamanio >= 0) {
            System.out.println(numeros.get(tamanio));
            tamanio--;
        }
    }
}
