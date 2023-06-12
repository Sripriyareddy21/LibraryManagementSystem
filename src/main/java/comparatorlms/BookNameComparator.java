package comparatorlms;

import java.util.Comparator;
import getsetlms.Books;

public class BookNameComparator implements Comparator<Books> {

	public int compare(Books m1, Books m2) {
		return m1.getBookTitle().compareTo(m2.getBookTitle());
	}
}
