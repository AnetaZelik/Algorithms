public class BubbleSort {
    public static int[] bubbleSort(int[] unsortedArray){
        for (int i = 0; i < unsortedArray.length; i++){
            for (int j = 0; j < unsortedArray.length-1; j++){
                if (unsortedArray[j] > unsortedArray[j+1]){
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }
        return unsortedArray;
    }
}
