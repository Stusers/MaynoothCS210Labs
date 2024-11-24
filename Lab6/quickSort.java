public class quickSort {
    public static void quickSort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        quickSorting(array, low, high);
    }

    public static void quickSorting(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSorting(array, low, partitionIndex - 1);
            quickSorting(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int left = low - 1;
        for (int s = low; s < high; s++) {
            if (array[s] < pivot) {
                left++;
                swap(array, s, left);
            }
        }
        swap(array, left + 1, high);
        return left + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
