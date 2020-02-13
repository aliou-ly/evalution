import java.util.List;

public class SortbyInsertion<E extends Comparable<E>> extends AbstractSort<E> {

    /*La liste est parcourue à partir du rang 2 jusqu'à dernier, à l'étape i, les i-1
        premiers éléments forment une sous-liste triés. Un rang d'insertion du ième est
        recherché de façon séquentielle
        */
    @Override
    public void sort(List<E> list) {
        for (int i = 2; i < list.size(); i++) {
            E elt = list.get(i);
            int j = i-1;
            while ((j>=0) && isOver(list.get(j), elt)) {
                /* On décale et on cherche le rang d'insertion*/
                list.set(j+1, list.get(j));
                j--;
            }
            // insertion de l'élément elt à la position j+1
            list.set(j+1,elt);
        }
    }
}