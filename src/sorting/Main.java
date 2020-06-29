package sorting;

import static sorting.PrintArray.printArray;

public class Main {
    public static void main(String[] args) {
        BubleSort obj = new BubleSort();
        SelectionSort obj2= new SelectionSort();
        int[] array = {8, 7, 5, 1, 2, 9};
        int[] array2 = {99,74,12,12,1,2,5};
//        System.out.println("Unsorted array");
//        obj.printArray(array);
//        obj.bubleSort(array);
//        System.out.println("Sorted array");
//        obj.printArray(array);

        System.out.println("Unsorted array");
        printArray(array2);
        System.out.println("Sorted array");
        obj2.selectionSort(array2);
        printArray(array2);

    }
}
