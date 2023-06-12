package testmethodslms;

import static org.junit.Assert.*;
import methodslms.Methods;
import getsetlms.Membership;
import getsetlms.Books;

import org.junit.Test;

public class TestCasesLms {

	@Test
	public void testAddNewMembership() {
		Methods methods = new Methods();
		methods.addNewMembership();
		assertNotNull(methods.id);
		assertNotNull(methods.name);
		assertNotNull(methods.address);
		assertTrue(methods.phoneNo > 0);
	}

//	    @Test
//	    public void testUpdateMembershipDetails1() {
//	        MethodsLMS methods = new MethodsLMS();
//	        Membership membership = new Membership(1, "	Sri", "Hyderabad", 9090909090L);
//	        methods.updateMembershipDetails(membership);
//	        assertNotNull(membership.getName());
//	        assertNotNull(membership.getAddress());
//	        assertTrue(membership.getPhoneNo() > 0);
//	    }
	@Test
	public void testUpdateMembershipDetails2() {
		Methods methods = new Methods();
		Membership membership = new Membership(1, "Sri", "Hyderabad", 9090909090L);
		methods.updateMembershipDetails(membership);
		assertEquals(membership.getName(), "Hari");
		assertEquals(membership.getAddress(), "Chennai");
		assertEquals(membership.getPhoneNo(), 9595959595L);
	}

	@Test
	public void testAddNewBook() {
		Methods methods = new Methods();
		methods.addNewBook();
		assertNotNull(methods.bookTitle);
		assertNotNull(methods.bookAuthor);
		assertNotNull(methods.bookCategory);
	}

//	    @Test
//	    public void testUpdateBook1() {
//	        MethodsLMS methods = new MethodsLMS();
//	        Books book = new Books(1, "BookTitle11", "BookAuthor1", "BookCategory1");
//	        methods.updateBook(book);
//	        assertNotNull(book.getBookTitle());
//	        assertNotNull(book.getBookAuthor());
//	        assertNotNull(book.getBookCategory());
//	    }
	@Test
	public void testUpdateBook2() {
		Methods methods = new Methods();
		Books book = new Books(1, "BookTitle1", "BookAuthor1", "BookCategory1");
		methods.updateBook(book);
		assertEquals(book.getBookTitle(), "BookTitle5");
		assertEquals(book.getBookAuthor(), "BookAuthor5");
		assertEquals(book.getBookCategory(), "BookCategory5");
	}

}
