import java.util.List;
import java.util.RandomAccess;
import java.util.Collections;
import java.util.Comparator;

public class MyCollections {
    private static final int BINARYSEARCH_THRESHOLD = 10;

    // 1-ый метод static int binarySearch(List> list, T key)
    private static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD)
            return Collections.binarySearch(list, key);
        else
            return Collections.binarySearch(list, key);
    }

    // 2-ой метод static int binarySearch(List, T key, Comparator c)
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        if (c==null)
            return binarySearch((List<? extends Comparable<? super T>>) list, key);

        if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD)
            return Collections.binarySearch(list, key, c);
        else
            return Collections.binarySearch(list, key, c);
    }

}
