
//************ Total Marks for ArrayListIterator class: 5 marks
import java.util.Iterator;

/**
 * An iterator over a ArrayList. This will return the Item that is contained in
 * the list
 * 
 */
public class ArrayListIterator<T> implements Iterator<T> {
	private ArrayList<T> list;
	private int cursor;

	/**
	 * The constructor
	 * 
	 * @param list the list to iterate over
	 */
	public ArrayListIterator(ArrayList<T> list) {
		this.list = list;
		if (!list.isEmpty()) {
			this.cursor = 0;
		}
	}

	@Override
	/**
	 * Returns true if there next() will return an element ********** 2 marks
	 * ****************************
	 */
	public boolean hasNext() {
		return cursor < list.size();
		// TODO: Complete
	}

	@Override
	/**
	 * Return the "next" item in the list and then advance the cursor. ********** 3
	 * marks ****************************
	 */
	public T next() {
		if (!hasNext()) {
			throw new ArrayListException("No more elements");
		}
		return list.get(cursor++);
	}

	@Override
	/**
	 * Should be used to remove the item from the list, but for now we do not
	 * include an implementation.
	 */
	public void remove() {
		throw new UnsupportedOperationException("Remove operation is not supported");
	}

}
