package Simple_Compound;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SimpTest {
	SimpAndComp s;
	@Before
	public void init()
	{
		s=new SimpAndComp();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(20,s.interest(6000,1,2),0);
		assertEquals(35,s.compound(6000,20,1),0);
	}

}
