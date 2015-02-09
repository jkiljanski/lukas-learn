package cow.farm.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    @SuppressWarnings("unchecked")
    private void ensureCapacity(int newCapacity) {
        E[] oldArray = array;
        array = (E[]) new Object[newCapacity];
        System.arraycopy(oldArray, 0, array, 0, lenght - 1);
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
    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean checkNullAndEqualsElements(int i, Object element) {
        if (element == null ? get(i) == null : element.equals(get(i))) {
            return true;
        } else return false;
    }

    @Override
    public boolean contains(Object element) {
        int i = indexOf(element);
        if (i >= 0) return true;
        else
            return false;
    }

    @Override
    public boolean containsAll(Collection c) {

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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int lastIndexOf(Object element) {
        int highIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (checkNullAndEqualsElements(i, element)) {
                highIndex = i;
            }
            return highIndex;
        }

        @Override
        public ListIterator listIterator () {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public ListIterator listIterator ( int index){
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean remove (Object element){
            int index = indexOf(element);
            //here you can just call remove(index), sooooo you have code already written :)
            if (index >= 0) {
                E[] oldArray = array;
                //extract line with array create
                array = (E[]) new Object[array.length];
                System.arraycopy(oldArray, (index + 1), array, index, lenght - 1);
                return true;
            } else return false;
        }

        @Override
        public E remove ( int index){
            if (index >= 0) {
                E[] oldArray = array;
                array = (E[]) new Object[array.length];
                System.arraycopy(oldArray, index + 1, array, index, array.length);
            }
            return null;
        }

        @Override
        public boolean removeAll (Collection c){
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean retainAll (Collection c){
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public E set ( int index, E element){
            if (index >= 0)
                //what if index is = 100 and you have only 10 element array?
                array[index] = element;
            return element;
        }

        @Override
        public List subList ( int fromIndex, int toIndex){
            if (fromIndex >= 0 & toIndex >= 0) {
                E[] subArray = (E[]) new Object[toIndex - fromIndex];
                System.arraycopy(array, fromIndex, subArray, 0, toIndex - fromIndex);
                //FIXME finish me
                //return subArray;
            }
            return null;
        }

        @Override
        public Object[] toArray () {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Object[] toArray (Object[]a){
            // TODO Auto-generated method stub
            return null;
        }

    }