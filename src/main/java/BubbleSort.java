public class BubbleSort {
    public static int[] bubbleSort(int[] unsortedArray){
        for (int i = 0; i < unsortedArray.length-1; i++){
            //at the end of each iteration the next largest number moves into its correct position
            for (int j = 0; j < unsortedArray.length -i -1; j++){
                if (unsortedArray[j] > unsortedArray[j+1]){
                    swap(unsortedArray, j);
                }
            }
        }
        return unsortedArray;
    }

    private static void swap(int[] unsortedArray, int j) {
        int temp = unsortedArray[j];
        unsortedArray[j] = unsortedArray[j +1];
        unsortedArray[j +1] = temp;
    }
}
