package cow.farm.utils;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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

	@Test
	public void shouldRemoveCurrentIndexElement() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		list.remove(0);
		// when
		int element = list.get(0);
		// then
		Assert.assertEquals(1, element);
	}

	@Test
	public void shouldSetCurrentElementWithNewValue() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		list.set(1, 4);
		// when
		int element = list.get(1);
		// then
		Assert.assertEquals(4, element);
	}

	@Test(enabled = false)
	public void shouldMakeSubListInCurrentRange() {
		// given
		LukaszGenericArrayList<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		LukaszGenericArrayList<Integer> subTestList = (LukaszGenericArrayList) list.subList(1, 4);
		// then
		Assert.assertEquals("1", subTestList.get(1));
		Assert.assertEquals("4", subTestList.get(4));
	}

	@Test
	public void shouldAddCollection() {
		// given
		List<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		List<Integer> collectionAdd = new ArrayList<>();
		collectionAdd.add(10);
		collectionAdd.add(20);
		collectionAdd.add(30);
		collectionAdd.add(40);
		collectionAdd.add(50);
		list.addAll(collectionAdd);
		// then
		int element1 = list.get(6);
		int element2 = list.get(7);
		Assert.assertEquals(10, element1);
		Assert.assertEquals(20, element2);
	}

	@Test
	public void shouldAddCollectionAtSpecificIndex() {
		// given
		List<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		List<Integer> collectionAdd = new ArrayList<>();
		collectionAdd.add(10);
		collectionAdd.add(20);
		collectionAdd.add(30);
		collectionAdd.add(40);
		collectionAdd.add(50);
		list.addAll(2, collectionAdd);
		// then
		int element1 = list.get(3);
		int element2 = list.get(4);
		Assert.assertEquals(20, element1);
		Assert.assertEquals(30, element2);
	}

	@Test
	public void shouldRemoveElementsSpecifiedInCollection() {
		// given
		List<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		List<Integer> collectionRemove = new ArrayList<>();
		for (int i = 2; i <= 4; i++) {
			collectionRemove.add(i);
		}
		list.removeAll(collectionRemove);
		// then
		boolean element1 = list.contains(3);
		boolean element2 = list.contains(4);
		Assert.assertEquals(false, element1);
		Assert.assertEquals(false, element2);
	}

	@Test
	public void shouldRetainElementsSpecifiedInCollection() {
		// given
		List<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		List<Integer> collectionRetain = new ArrayList<>();
		for (int i = 2; i <= 4; i++) {
			collectionRetain.add(i);
		}
		list.retainAll(collectionRetain);
		// then
		boolean element1 = list.contains(3);
		boolean element2 = list.contains(4);
		Assert.assertEquals(true, element1);
		Assert.assertEquals(true, element2);
	}

	@Test
	public void shouldReturnArrayContainingAllElementsOfList() {
		// given

		List<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		Object[] returnedArray = list.toArray();

		//then
		Assert.assertEquals(0, returnedArray[0]);
		Assert.assertEquals(1, returnedArray[1]);
	}

	@Test
	public void shouldReturnArrayOfGivenArrayType() {
		// given
		List<Integer> list = new LukaszGenericArrayList<>();
		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		// when
		Integer[] returnedArray = new Integer[10];
				list.toArray(returnedArray);

		//then
		int element1=returnedArray[0];
		int element2=returnedArray[1];
		Assert.assertEquals(0, element1);
		Assert.assertEquals(1, element2);
		Assert.assertNull(returnedArray[6]);
	}
}

























