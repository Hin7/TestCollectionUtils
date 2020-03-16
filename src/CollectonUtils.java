/**
 * Task for lesson 4 SBT
 *
 *
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectonUtils {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }


    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> List<T> newArrayList(T... a) {
        List<T> list = new ArrayList<>();
        for (T v : a)
            list.add(v);
        return list;
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List<? extends T> limit(List<? extends T> source, int size) {
        return source.subList(0, size);
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T val : c2)
            if (c1.contains(val)) return true;
        return false;
    }

    public static <T> List<T> range(List<? extends Comparable> list, T min, T max) {
        List<T> result = new ArrayList<T>();
        for (Comparable val : list) {
            if (val.compareTo(min) >= 0 && val.compareTo(max) <= 0) result.add((T) val);
        }
        return result;
    }

    public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator comparator) {
        List<T> result = new ArrayList<T>();
        for(T val : list){
            //System.out.println(val + " " + min + " " + max);
            if(comparator.compare(val, min) >=0 && comparator.compare(val, max) <=0) result.add(val);
        }
        return result;
    }
}
