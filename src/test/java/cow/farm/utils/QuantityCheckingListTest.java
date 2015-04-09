package cow.farm.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

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
		HashMap map = list.getQuantityOfEachObject();
		Assert.assertEquals(2, map.get("a"));
	}
}
