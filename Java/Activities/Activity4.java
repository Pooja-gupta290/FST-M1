public class Activity4 {

        public static void main(String[] args) {
       
        int[] numbers = {34, 7, 23, 32, 5, 62};

        System.out.println("Array before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(numbers);

        System.out.println("Array after sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

           array[j + 1] = key;
        }
    }
}
