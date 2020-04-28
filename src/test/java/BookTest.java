import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book= new Book("Twilight", "Stephanie Meyer", "The best");
    }

    @Test
    public void hasDetails(){
        assertEquals("Twilight", book.getTitle());
        assertEquals("Stephanie Meyer", book.getAuthor());
        assertEquals("The best", book.getGenre());
    }

}
