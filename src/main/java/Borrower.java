import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks= new ArrayList<Book>();
    }

    public void borrowBook(Library library){
        Book book = library.removeBook();
        this.borrowedBooks.add(book);
    }

    public Book returnBook(){
        return this.borrowedBooks.remove(0);
    }

    public int getNumberOfBooks(){
        return this.borrowedBooks.size();
    }


}
