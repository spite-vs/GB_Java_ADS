public class task {

    public static void main(String[] args) {
        int array[] = new int[] { 1, 165, 254, 5, 4, 8, 1, 6, 7, 5, 2, 3, 4, 8, 54, 65, 15, 21, 56, 68 };
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void sort(int[] array) {

        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);

        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            heapify(array, heapSize, largest);
        }
    }
}
