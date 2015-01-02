package net.grzechocinski.android.dagger2example.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D2ECollectionUtils {

    public <T> List<T> toSortedList(Comparator<T> comparator, T... stringsToSort) {
        List<T> list = Arrays.asList(stringsToSort);
        Collections.sort(list, comparator);
        return list;
    }
}
