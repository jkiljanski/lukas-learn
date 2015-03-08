package cow.farm.utils;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LukaszArrayListTest {

	@Test
	public void shouldBeEmptyOnBeginning() {
		// given
		LukaszGenericArrayList<String> list = new LukaszGenericArrayList<>();
		// when
		int size = list.size();
		// then
		Assert.assertEquals(0, size);
	}

	@Test
	public void shouldAddOneEndHaveSize1() {
		// given
		LukaszGenericArrayList<String> list = new LukaszGenericArrayList<>();
		list.add("cos");
		// when
		int size = list.size();
		// then
		Assert.assertEquals(1, size);
	}

	@Test
	public void shouldRunClearAndHaveSize0() {
		// given
		LukaszGenericArrayList<String> list = new LukaszGenericArrayList<>();
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
		LukaszGenericArrayList<String> list = new LukaszGenericArrayList<>();
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
		LukaszGenericArrayList<String> list = new LukaszGenericArrayList<>();
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
		LukaszGenericArrayList<String> list = new LukaszGenericArrayList<>();
		list.add("one");
		// when
		boolean state = list.isEmpty();
		// then
		Assert.assertEquals(false, state);
	}

	@Test
	public void schouldEnsureCapacityToAddElement() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		// when
		int size = list.size();
		// then
		Assert.assertEquals(11, size);
	}

	@Test
	public void arrayTestOverflow() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 20; i++) {
			list.add(i);
		}
		// when
		int size = list.size();
		// then
		Assert.assertEquals(21, size);
	}

	@Test
	public void schouldAddElementInMiddleToExistingList() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		list.add(2, 0);
		// when
		int element = list.get(2);
		// then
		Assert.assertEquals(0, element);
	}

	@Test
	// zrobi� dwa osobne testy ale wydzieli� cz�� wsp�ln�. vide sms od Jacka
	public void schouldcheckIfListContainsElement() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		boolean elementt = list.contains(3);
		boolean elementf = list.contains("a");
		// then
		Assert.assertEquals(true, elementt);
		Assert.assertEquals(false, elementf);
	}

	@Test
	public void schouldReturnIndexOfWantedElement() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		int element = list.indexOf(3);
		// then
		Assert.assertEquals(3, element);
	}

	@Test
	public void schouldReturnLastIndexOfWantedElement() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		list.add(4);
		// when
		int element = list.lastIndexOf(4);
		// then
		Assert.assertEquals(6, element);
	}

	@Test
	public void schouldReturnNegative1IfNoWantedElement() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		int element = list.indexOf(6);
		// then
		Assert.assertEquals(-1, element);
	}


	@Test(enabled = false)
	public void schouldRemoveCurretnElement() {
		// given
		LukaszGenericArrayList<String> list = new LukaszGenericArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.remove(1);
		// when
		String element = list.get(1);
		// then
		Assert.assertEquals("three", element);
	}

	@Test(enabled = false)
	public void schouldRemoveCurretnIndexElement() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 5; i <= 0; i--) {
			list.add(i);
		}
		list.remove(0);
		// when
		int element = list.get(0);
		// then
		Assert.assertEquals(4, element);
	}

	@Test
	public void schouldSetCurrentElementWithNewValue() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 5; i <= 0; i--) {
			list.add(i);
		}
		list.set(1, 4);
		// when
		int element = list.get(1);
		// then
		Assert.assertEquals(4, element);
	}
}
