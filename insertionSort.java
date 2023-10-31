package sortAlgorithm;


public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        insertionSort(arr);
        printArray(arr);
    }

   static void insertionSort(int[] x) {
        for (int i = 1; i < x.length; i++) {
            int key = x[i];
            int j = i - 1;
            while (j >= 0 && x[j] > key) {
                x[j + 1] = x[j];
                j --;
            }
            x[j + 1] = key;
        }
    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
