import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSuits {
    /* Cette classe permet de générer des listes sur un intervalle
        d'entier de façon aléatoire.
     */
    public static List<Integer> randomInteger(int supBound, int size) {
        Random random  = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(supBound));
        }
        return list;
    }
}