import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    public void bubbleSortTest(){
        //given
        int[] unsortedArray = new int[]{1,-30, 5, 1, 3, -3};
        int[] expectedArray = new int[]{-30, -3, 1, 1, 3, 5};

        //when
        int [] actualArray = BubbleSort.bubbleSort(unsortedArray);

        //then
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}
