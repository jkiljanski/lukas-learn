package nauka.example2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LukaszArrayListTest {

	@Test
	public void shouldBeEmptyOnBeginning() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		// when
		int size = list.size();
		// then
		Assert.assertEquals(0, size);
	}

	@Test
	public void shouldAddOneEndHaveSize1() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		list.add("cos");
		// when
		int size = list.size();
		// then
		Assert.assertEquals(1, size);
	}

	@Test
	public void shouldRunClearAndHaveSize0() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		list.add("cos");
		list.clear();
		// when
		int size = list.size();
		// then
		Assert.assertEquals(0, size);
	}

	@Test
	public void schouldGetSpecificIndexElement() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		list.add("one");
		list.add("two");
		// when
		Object element = list.get(1);
		// then
		Assert.assertEquals("two", element);
	}

	@Test
	public void schouldIsEmptyBeTrueAfterClear() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		list.add("one");
		list.add("two");
		list.clear();
		// when
		boolean state = list.isEmpty();
		// then
		Assert.assertEquals(true, state);
	}

	@Test
	public void schouldIsEmptyBeFalseAfterAdd() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		list.add("one");
		// when
		boolean state = list.isEmpty();
		// then
		Assert.assertEquals(false, state);
	}

	@Test
	public void schouldEnsureCapacityToAddElement() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		// when
		int size = list.size();
		// then
		Assert.assertEquals(11, size);
	}
	//Additional tests after Jacek verification
	
	@Test
	public void arrayTestOverflow() {
		// given
		LukaszArrayList list = new LukaszArrayList();
		for (int i = 0; i <= 20; i++) {
			list.add(i);
		}
		// when
		int size = list.size();
		// then
		Assert.assertEquals(21, size);
	}
	
	
}
