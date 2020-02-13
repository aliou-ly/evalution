import java.util.List;

public class SortByBulle<E extends Comparable<E>> extends AbstractSort<E> {

    @Override
    public void sort(List<E> list) {
        // la fonction trie la liste en ordres croissant des objects

        /* la sous-liste ième(list,0) à ième(list,i-1) est triée et les
             éléments de ième(list,i) à iéme(list,n) sont supérieurs ou également
             ième(list,0) à ième(list,i-1)
            */
        for (int i = list.size()-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (isOver(list.get(j), list.get(j+1)))
                    permute(j,j+1, list);
            }
        }
    }
}