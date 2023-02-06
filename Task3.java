import java.util.Arrays;

/**Реализовать алгоритм пирамидальной сортировки (HeapSort).
 * */
public class Task3 {
    public static void main(String[] args) {
        int[] arrNum = {4, 10, 26, 305, 15, 57, 1003, 99, 7};
        System.out.println("ИСХОДНЫЙ МАССИВ ЧИСЕЛ:       " + Arrays.toString(arrNum));
        heapSort(arrNum);
        System.out.println("СОРТИРОВКА КУЧЕЙ (HeapSort): " + Arrays.toString(arrNum));
    }
    private static void heapSort(int[] array) {
        int size = array.length;
        for (int i = size / 2 - 1; i >=0 ; i--)
            buildHeap(array, i, size);
        for (int i = size - 1; i >= 0 ; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            buildHeap(array, 0, i);
        }
    }
    private static void buildHeap(int[] array, int i, int size) {
        int leftChild = i * 2 + 1;
        int rightChild = i * 2 + 2;
        int maxChild = i;

        if(leftChild < size && array[leftChild] > array[maxChild])
            maxChild = leftChild;
        if(rightChild < size &&  array[rightChild] > array[maxChild])
            maxChild = rightChild;
        if(i != maxChild){
            int temp = array[i];
            array[i] = array[maxChild];
            array[maxChild] = temp;
            buildHeap(array, maxChild, size);
        }
    }
}
