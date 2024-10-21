import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bonus {
    public static void main(String[] args) {
        ArrayList<PersonBonus> personas = new ArrayList<>();
        personas.add(new PersonBonus("Alice", 30));
        personas.add(new PersonBonus("Bob", 25));
        personas.add(new PersonBonus("Charlie", 35));
        personas.add(new PersonBonus("Diana", 28));

        Collections.sort(personas, new Comparator<PersonBonus>() {
            public int compare(PersonBonus p1, PersonBonus p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
        System.out.println("\n La edad ascendente es:");
        for (PersonBonus persona : personas) {
            System.out.println(persona);
        }
    }
}
