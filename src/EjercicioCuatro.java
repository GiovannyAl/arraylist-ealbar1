import java.util.ArrayList;

public class EjercicioCuatro {

        public static void main(String[] args) {
            ArrayList<String> lista1 = new ArrayList<>();
            ArrayList<String> lista2 = new ArrayList<>();

            lista1.add("Apple");
            lista1.add("Banana");
            lista1.add("Cherry");
            lista1.add("Date");

            lista2.add("Banana");
            lista2.add("Date");
            lista2.add("Elderberry");
            lista2.add("Fig");

            ArrayList<String> comunes = new ArrayList<>();
            for (String item : lista1) {
                if (lista2.contains(item)) {
                    comunes.add(item);
                }
            }
            System.out.println("Elementos comunes: " + comunes);
        }



}
