package finaltest;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        System.out.println(compareLists(list1, list2));
    }

    public static String compareLists(List<Integer> list1, List<Integer> list2) {
        ListComparator comparator = new ListComparator();
        return comparator.compareLists(list1, list2);
    }

}
