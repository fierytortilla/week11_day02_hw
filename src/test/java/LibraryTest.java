import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private int capacity;

    @Before
    public void before(){
        capacity= 5;
        library= new Library(capacity);
        book1= new Book("Twilight", "Stephanie Meyer", "The best");
        book2= new Book("Requiem for a Dream", "Hubert Selby Jr", "Comedy");
        book3= new Book("A Book of Common Prayer", "Joan Didion", "The best");
        book4= new Book("Rambo", "Johnny Knifeman", "Action");
        book5= new Book("Grimscribe", "Thomas Ligotti", "Horror");
        book6= new Book("The Conspiracy Against the Human Race", "Thomas Ligotti", "Horror");
    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.getNumberOfBooks());
    }

    @Test
    public void canHaveMaxCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.getNumberOfBooks());
    }

    @Test
    public void hasGenreMap(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        HashMap<String, Integer> genreHashMap = new HashMap<String, Integer>();
        genreHashMap.put("The best", 2);
        genreHashMap.put("Action", 1);
        genreHashMap.put("Horror", 1);
        genreHashMap.put("Comedy", 1);
        assertEquals(genreHashMap, library.getGenreHashMap());
    }


}
