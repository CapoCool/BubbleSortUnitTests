import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BubbleSortTests {
	
	@Test
	public void testID1() {
		int[] array = {5,4,3,2,1};
		int[] sorted = {1,2,3,4,5};
		BubbleSort.bubbleSortEfficient(array, array.length);
		assertArrayEquals(sorted, array);
	}
	
	@Test
	public void testID2() {
		
		int[] array = {1};
		int[] sorted = {1};
		BubbleSort.bubbleSortEfficient(array, array.length);
		assertArrayEquals(sorted, array);
	}
	
	@Test
	public void testID3() {
		
		int[] array = {1,2,3,4,5};
		int[] sorted = {1,2,3,4,5};
		BubbleSort.bubbleSortEfficient(array, array.length);
		assertArrayEquals(sorted, array);
	}
	
	@Test
	public void testID4() {
		
		int[] array = {};
		int[] sorted = {};
		BubbleSort.bubbleSortEfficient(array, array.length);
		assertArrayEquals(sorted, array);
	}

}
