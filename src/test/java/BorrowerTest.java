import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Library library;
    private Borrower borrower;
    private int capacity;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        borrower= new Borrower();
        capacity= 5;
        library= new Library(capacity);
        book1= new Book("Twilight", "Stephanie Meyer", "The best");
        book2= new Book("Requiem for a Dream", "Hubert Selby Jr", "Comedy");
        book3= new Book("A Book of Common Prayer", "Joan Didion", "The best");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library);
        assertEquals(2, library.getNumberOfBooks());
        assertEquals(1, borrower.getNumberOfBooks());
    }


}
