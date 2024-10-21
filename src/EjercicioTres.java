import java.util.ArrayList;

public class EjercicioTres {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        ArrayList<Integer> pares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        System.out.println("Lista original: " + numeros);
        System.out.println("Lista de números pares: " + pares);
    }
}
