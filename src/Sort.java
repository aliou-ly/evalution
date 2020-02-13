import java.util.List;

public interface Sort<E extends Comparable<E>> {
    /* L'interface Sort une abstraction du type de Tri mais sa généricité ne permet
       de prendre que des objects comparable*/

    void sort(List<E> list);
    void permute(int indexOne, int indexTwo, List<E> list);
    boolean isOver(E elt, E elt1);
}