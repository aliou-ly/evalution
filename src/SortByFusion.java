import java.util.ArrayList;
import java.util.List;

public class SortByFusion<E extends Comparable<E>> extends AbstractSort<E>{

    @Override
    public void sort(List<E> list) {
        sortByFusion(list, 0, list.size());
    }


    public void interclassement(List<E> list, int begin, int end,int middle) {
        List<E> median = new ArrayList<>();

        for (int i = begin; i < middle; i++) {
            median.add(list.get(i));
        }
        for (int i = middle; i < end ; i++) {
            median.add(list.get(end-i+middle+1));
        }
        int beginI = begin, endI = end;
        for (int i = begin ; i < end; i++) {
            if (isOver(median.get(endI),median.get(beginI))) {
                list.set(i, median.get(beginI));
                beginI++;
            }
            else {
                list.set(i,median.get(endI));
                endI--;
            }
        }
    }
    public void sortByFusion(List<E> list, int begin, int end) {
        int middle = (begin + end)/2;
        if (begin < end) {
            sortByFusion(list, begin, middle);
            sortByFusion(list, (middle+1),end);
            interclassement(list, begin, end, middle);
        }
    }
}