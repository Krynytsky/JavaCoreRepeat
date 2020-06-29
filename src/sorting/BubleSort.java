package sorting;

import org.jetbrains.annotations.NotNull;

public class BubleSort implements PrintArray {

    public void bubleSort(int[] array) {
        int length = array.length;
        int tmpl;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    tmpl = array[i];
                    array[i] = array[j];
                    array[j] = tmpl;
                }
            }
        }
    }
}

