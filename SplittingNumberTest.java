import static org.junit.Assert.*;

import org.junit.Test;

public class SplittingNumberTest {

	@Test
	public void maxProductOfSummandsOfNumber() {
		assertEquals(6, SplittingNumber.getMaxProduct(5));
		assertEquals(9, SplittingNumber.getMaxProduct(6));
		assertEquals(12, SplittingNumber.getMaxProduct(7));
		assertEquals(18, SplittingNumber.getMaxProduct(8));
		assertEquals(27, SplittingNumber.getMaxProduct(9));
		assertEquals(36, SplittingNumber.getMaxProduct(10));		
		assertEquals(243, SplittingNumber.getMaxProduct(15));		
		assertEquals(1458, SplittingNumber.getMaxProduct(20));		
		assertEquals(7412080755407364L, SplittingNumber.getMaxProduct(100));
	}

}
