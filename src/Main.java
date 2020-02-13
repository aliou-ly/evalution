
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = RandomSuits.randomInteger(50, 20);
        long[] temps = new long[6];
        Sort Bulle = new SortByBulle();
        Sort Fast = new FastSort();
        Sort fusionSort = new FastSort();

        List<Integer> listFast = new ArrayList<>(list);
        List<Integer> listFusion = new ArrayList<>(list);
        List<Integer> listBulle = new ArrayList<>(list);

        System.out.println(list.toString()+"\n");


        temps[0] = System.currentTimeMillis();
        Thread.currentThread().sleep(1);
        Bulle.sort(listBulle);
        System.out.println(" Run time Tri à Bulle : "+ (System.currentTimeMillis() - temps[0]) + "\n"+ listBulle.toString()+"\n");

        temps[1] = System.currentTimeMillis();
        Thread.currentThread().sleep(1);
        Fast.sort(listFast);
        System.out.println(" Run time Tri Rapide: "+ (System.currentTimeMillis() - temps[1]) + "\n"+ listFast.toString()+"\n");

        temps[3] = System.currentTimeMillis();
        Thread.currentThread().sleep(1);
        fusionSort.sort(listFusion);
        System.out.println(" Run time Tri à Fusion: "+ (System.currentTimeMillis() - temps[3]) + "\n"+ listFusion.toString()+"\n");

    }
}