package cow.farm.utils;

import java.util.*;

@SuppressWarnings("rawtypes")
public class LukaszGenericArrayList<E> implements List<E> {

	// typeO
	int lenght = 0;
	int INITIAL_CAPACITY = 10;
	int currentIndex = 0;

	E[] array;

	@SuppressWarnings("unchecked")
	public LukaszGenericArrayList() {
		//oh, this may be hard because of this casting, you can also keep Object[] and do the casing and checking in every method
		// but maybe this also works
		array = (E[]) new Object[INITIAL_CAPACITY];
	}

	private LukaszGenericArrayList(E[] subArray) {
		int length = subArray.length;
		array = Arrays.copyOf(subArray, length);
		this.lenght = length;
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity(int newCapacity) {
		E[] oldArray = array;
		array = (E[]) new Object[newCapacity];
		System.arraycopy(oldArray, 0, array, 0, lenght);
	}

	@Override
	public boolean isEmpty() {
		return lenght == 0;
	}

	@Override
	public boolean add(E element) {
		add(lenght, element);
		return true;
	}

	@Override
	public void clear() {
		lenght = 0;

	}

	@Override
	public E get(int index) {
		return array[index];
	}

	public int size() {
		return lenght;
	}

	@Override
	public void add(int index, E element) {
		if (array.length == lenght) {
			ensureCapacity(lenght * 2);
		}
		for (int i = index; i < lenght; i++) {
			array[i] = array[i - 1];
		}
		array[index] = element;
		lenght++;
	}

	@Override
	public boolean addAll(Collection collection) {
		addAll(lenght, collection);
		return true;
	}

	@Override
	public boolean addAll(int index, Collection collection) {
		Object[] collectionArray = collection.toArray();
		int collectionSize = collectionArray.length;
		ensureCapacity(lenght + collectionSize);
		int offsetNumber = lenght - index;

		if (offsetNumber >= 0) {
			System.arraycopy(array, index, array, index + collectionSize, offsetNumber);
			System.arraycopy(collectionArray, 0, array, index, collectionSize);
		}
		return true;
	}

	private boolean checkNullAndEqualsElements(int i, Object element) {
		if (element == null ? get(i) == null : element.equals(get(i))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object element) {
		int i = indexOf(element);
		if (i >= 0) return true;
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// todo contains all collection
		return false;
	}

	@Override
	public int indexOf(Object element) {
		for (int i = 0; i < array.length; i++)
			if (checkNullAndEqualsElements(i, element))
				return i;
		return -1;
	}

	@Override
	public Iterator iterator() {
		// TODO iterator
		return null;
	}

	@Override
	public int lastIndexOf(Object element) {
		int highIndex = -1;
		for (int i = 0; i < array.length; i++) {
			if (checkNullAndEqualsElements(i, element)) {
				highIndex = i;
			}
		}
		return highIndex;
	}

	@Override
	public ListIterator listIterator() {
		// TODO list iterator
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO list Iterator with index
		return null;
	}

	private void checkIndexBounds(int index) {
		if (index < 0)
			throw new IndexOutOfBoundsException("Index out of bounds(less then 0.");
		if (index > lenght)
			throw new IndexOutOfBoundsException("Index out of bound( higher then list length.");
	}

	@Override
	public boolean remove(Object element) {
		int index = indexOf(element);
		if (-1 == index) {
			return false;
		}
		remove(index);
		return true;
	}

	@Override
	public E remove(int index) {
		checkIndexBounds(index);
		System.arraycopy(array, index + 1, array, index, lenght - index);
		lenght--;
		return array[index];
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO removeAll collection
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO retainAll
		return false;
	}

	@Override
	public E set(int index, E element) {
		if(index>=0)
		//what if index is = 100 and you have only 10 element array?
			array[index]=element;
		return element;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		checkIndexBounds(fromIndex);
		checkIndexBounds(toIndex);
		E[] subArray = (E[]) Arrays.copyOfRange(array, fromIndex, toIndex);
		LukaszGenericArrayList<E> partList = new LukaszGenericArrayList<>(subArray);
		return partList;
	}

	@Override
	public Object[] toArray() {
		// TODO Object to array
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO to array also object
		return null;
	}

}
