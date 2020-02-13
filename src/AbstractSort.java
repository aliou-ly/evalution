import java.util.List;

abstract class AbstractSort<E extends Comparable<E>> implements Sort<E> {
    /*J'ai fait l'abstraction de ces méthodes afin d'éviter la violation de
    règle DRY(Don't repeat yourself)*/

    @Override
    public void permute(int indexOne, int indexTwo, List<E> list) {
        E stock = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo, stock);
    }

    /* la fonction renvoie le booleen de la supérieur stricte de l'élément gauche
       par rapport à l'élément droit*/
    @Override
    public boolean isOver(E elt, E elt1) {
        return (elt.compareTo(elt1) > 0);
    }
}