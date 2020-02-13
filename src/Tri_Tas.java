import java.util.ArrayList;
import java.util.List;

public class Tri_Tas<E extends Comparable<E>> extends AbstractSort<E> {


    private void createTas(List<E> list) {
        int middle = (list.size()-1)/2;
        for (int i = middle; i >=0; i--) {
            entasser_Max(list,i);
        }
    }


    private void entasser_Max(List<E> list, int index) {
        int max = index;
        int left = left(index), right = right(index);
        if(left < list.size() && isOver(list.get(left),list.get(index)))
            max = left;
        if (right < list.size() && isOver(list.get(right),list.get(index))) {
            max = left;
        }

        if (max != index) {
            permute(max,index,list);
            entasser_Max(list,max);
        }
    }

    private int left(int index) { return 2*index +1; }
    private  int right(int index) {return 2*index +2; }


    @Override
    public void sort(List<E> list) {
        createTas(list);
        int taille = list.size() - 1;
        ArrayList<E> listUtil = new ArrayList<>(list);
        while (taille >= 0) {
            permute(taille, 0, list);
            list.set(taille, listUtil.get(taille));
            listUtil.remove(taille);
            taille = taille - 1;
            entasser_Max(listUtil, 0);
        }
    }
}