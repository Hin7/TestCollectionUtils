import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestCollectionUtils {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println("Test addAll()");
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        CollectonUtils.addAll(list1, list2);
        System.out.println("Now list2 = " + list2);

        System.out.println();
        System.out.println("Test newArrayList()");
        List<Integer> list3 = CollectonUtils.newArrayList(3, 5, 7, 13);
        System.out.println("list3 = " + list3);
        list3 = CollectonUtils.newArrayList();
        list3.add(3);
        list3.add(5);
        list3.add(7);
        list3.add(15);
        System.out.println("list3 = " + list3);

        System.out.println();
        System.out.println("Test indexOf()");
        System.out.println("Index 7 = " + CollectonUtils.indexOf(list3, 7));
        System.out.println("Index 15 = " + CollectonUtils.indexOf(list3, 15));

        System.out.println();
        System.out.println("Test limit()");
        CollectonUtils.addAll(list3, list2);
        System.out.println("list2 = " + list2);
        System.out.println("list2 limit 8 = " + CollectonUtils.limit(list2, 8));

        System.out.println();
        System.out.println("Test add()");
        System.out.println("list3 = " + list3);
        CollectonUtils.add(list3, 15);
        System.out.println("Now list3 = " + list3);

        System.out.println();
        System.out.println("Test removeAll()");
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        CollectonUtils.removeAll(list2, list1);
        System.out.println("Now list2 = " + list2);

        System.out.println();
        System.out.println("Test containAll()");
        list3.remove((Integer) 15);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        System.out.println("list 2 contain list3 = " + CollectonUtils.containsAll(list2, list3));
        System.out.println("list 2 contain 10,2,3 = " + CollectonUtils.containsAll(list2, Arrays.asList(10, 2, 3)));

        System.out.println();
        System.out.println("Test containsAny()");
        System.out.println("list3 contains 1,2,3 = " + CollectonUtils.containsAny(list3, Arrays.asList(1, 2, 3)));
        System.out.println("list3 contains 4,6,8 = " + CollectonUtils.containsAny(list3, Arrays.asList(4, 6, 8)));

        System.out.println();
        System.out.println("Test range()");
        System.out.println("list 3 = " + list3);
        System.out.println("list3 5..13 = " + CollectonUtils.range(list3, 5, 13));
        //System.out.println("list2 = " + list2);
        //System.out.println("list2 2..13 = " + CollectonUtils.range(list2, 2, 13)); - не могу, так как Number не Comparable

        System.out.println();
        System.out.println("Test range(,,comparator)");
        //Comparator<Number> NComp = (f, s) -> f.intValue() - s.intValue();
        System.out.println("list3 = " + list3);
        System.out.println("list3 5..13 = " + CollectonUtils.range(list3, 5, 13,
                Comparator.comparingInt(Number::intValue)));
        System.out.println("list2 = " + list2);
        System.out.println("list2 3..7 = " + CollectonUtils.range(list2, 3, 7,
                Comparator.comparingInt(Number::intValue)));

    }
}
