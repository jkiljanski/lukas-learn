package nauka.example2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("rawtypes")
public class LukaszArrayList implements List {

	//typeO
	int lenght = 0;
	int INITIAL_CAPACITY = 10;

	Object[] array;

	public LukaszArrayList() {
		//why? It is 0 already   OK
		//clear();
		array = new Object[INITIAL_CAPACITY];

	}

	private void ensureCapacity(int newCapacity) {
		Object[] oldArray = array;
		array = new Object[newCapacity];
		//for (int i = 0; i == lenght; i++)
			//try to use System.arraycopy(), it is native, therefore faster   OK
			//array[i] = oldArray[i];
			System.arraycopy(oldArray, 0, array, 0, lenght-1);
	}

	@Override
	public boolean isEmpty() {
		return lenght == 0;
	}

	@Override
	public boolean add(Object e) {
		//write test: overflow arrays twice, it will blow up because of 
		// this strange paradigm    OK
		//Lukasz :my mistake, i shouldn't compare to INITIAL_CAPATITY because it is state
		//if (lenght == INITIAL_CAPACITY) {
		//	ensureCapacity((lenght * 2));
		//}
		if (array.length==lenght){
			ensureCapacity(lenght*2);
		}
		//you are using size() and lenth, try to use one only to make code cleaner  OK
		array[lenght] = e;
		lenght++;
		return true;
	}

	@Override
	public void clear() {
		lenght = 0;

	}

	@Override
	public Object get(int index) {
		if (index < 0 || index > (lenght-1)) {
			//do we really need this (it will happen anyway)? write test for that  OK
			//how? i don't know how in test catch that class make an exception
			throw new ArrayIndexOutOfBoundsException();
		}
		return array[index];
	}

	public int size() {
		return lenght;
	}

	/** IMPLEMENT ONLY THOSE ABOVE **/

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
