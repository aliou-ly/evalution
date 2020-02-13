import java.util.List;

public class FastSort<E extends Comparable<E>> extends AbstractSort<E> {
    @Override
    public void sort(List<E> list) {
        sorted(0,list.size()-1,list);
    }

/* la fonction Partition réarrange la list de façon à ce qu'à la fin
	    de l'algorithme le sous-liste [begin-intPartition] contienne uniquement
	    des valeurs inférieures au pivot et le sous-listes [intPartition-end]
	    des valeurs supérieurs et le pivot est à la position intPartition
	    */
    private int partition(int begin, int end, List<E> list) {
        //le boolean est la condition favorable à exécution de la fonction
        boolean booleen = (end < list.size()) && (begin >=0);
        if ( !booleen)
            return end;
        // initialisation de la position du pivot
        int intPartition = begin;
        E pivot = list.get(end);
        for (int i = begin; i < end; i++) {
            if (isOver(pivot,list.get(i))) {
                permute(i,intPartition,list);
                intPartition++;
            }
        }
        return intPartition;
    }

    /* la fonction fait appel à Partition ensuite elle fait la récursivité de part et d'autre
         de chaque nouvelle partition afin placer chaque pivot à la bonne place
         */
    private void sorted(int begin, int end, List<E> list) {
        if (begin < end) {
            int initiale = partition(begin,end,list);
            permute(initiale, end,list);
            sorted(begin,initiale-1,list);
            sorted(initiale+1, end,list);
        }
    }

}