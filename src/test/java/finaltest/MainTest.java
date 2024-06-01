package finaltest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void compare_singleElementLists_returnsEqualMessage() {
        List<Integer> list1 = Arrays.asList(1);
        List<Integer> list2 = Arrays.asList(1);
        ListComparator comparator = new ListComparator();
        String result = comparator.compareLists(list1, list2);
        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareLists_emptyLists_returnsEqualMessage() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();
        ListComparator comparator = new ListComparator();
        String result = comparator.compareLists(list1, list2);
        assertEquals("Средние значения равны", result);
    }

    @Test
    void compare_sameAverage_returnsEqualMessage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        ListComparator comparator = new ListComparator();
        String result = comparator.compareLists(list1, list2);
        assertEquals("Средние значения равны", result);
    }

    @Test
    void compare_negativeNumbers_correctResult() {
        List<Integer> list1 = Arrays.asList(-1, -2, -3);
        List<Integer> list2 = Arrays.asList(-4, -5, -6);
        ListComparator comparator = new ListComparator();
        String result = comparator.compareLists(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    void compareLists_firstListHasHigherAverage_returnsFirstListMessage() {
        List<Integer> list1 = Arrays.asList(4, 5, 6);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        String result = Main.compareLists(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }


    @Test
    public void testCompareLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        ListComparator comparator = new ListComparator();
        String result = comparator.compareLists(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_largeNumbers_correctResult() {
        List<Integer> list1 = Arrays.asList(1000000, 2000000, 3000000);
        List<Integer> list2 = Arrays.asList(4000000, 5000000, 6000000);
        ListComparator comparator = new ListComparator();
        String result = comparator.compareLists(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

}
