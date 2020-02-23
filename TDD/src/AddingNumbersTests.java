import org.junit.Assert;
import org.junit.Test;

public class AddingNumbersTests {
	private Calculator myCalculator=new Calculator();
	@Test
	public void addTwoPassitiveNum()
	{
		int expected=30;
		int actual=myCalculator.add(10,20);
		Assert.assertEquals(expected, actual);
	
	}
	@Test
	public void addTwoNagativenum()
	{
		int expected=-30;
		int actual=myCalculator.add(-10,-20);
		Assert.assertEquals(expected, actual);
	}
	

}
