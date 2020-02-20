package clean_code;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class HouseTest {
	HouseInt h;
	@Before
	public void init()
	{
		h=new HouseInt();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(4500000,h.FullyHomeCost("HighStandardMaterials",2500),0);
	}

}
