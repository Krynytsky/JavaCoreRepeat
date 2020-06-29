package sorting;

public interface PrintArray {
    static void printArray(int[] array) {
        int length = array.length;
        for (int value : array) System.out.print(value + " ");
        System.out.println();
    }
}
