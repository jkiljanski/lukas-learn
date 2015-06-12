package cow.farm.utils;

import org.testng.annotations.Test;

public class QuantityCheckingListTest {

	@Test
	public void shouldReturnMapOfValues() {
		//given
		QuantityCheckingList<String> list = new QuantityCheckingList();
		//when
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("d");
		//then
		//HashMap map = list.getQuantityOfEachObject();
		//Assert.assertEquals(map.get("a"), 2);
		//Assert.assertEquals(map.get("b"), 2);
		//Assert.assertEquals(map.get("c"), 1);
		//Assert.assertEquals(map.get("d"), 1);
	}
}
