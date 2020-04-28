import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genreHashMap;

    public Library(int capacity){
        this.capacity= capacity;
        this.books= new ArrayList<Book>();
        this.genreHashMap= new HashMap<String, Integer>();
    }

    private boolean atCapacity(){
        if(this.books.size()>= this.capacity){
            return true;
        }
        return false;
    }

    public void addBook(Book book){
        if(!this.atCapacity()){
            this.books.add(book);
        }
    }

    public int getNumberOfBooks(){
        return this.books.size();
    }


    public Book removeBook() {
        return this.books.remove(0);
    }

    public HashMap<String, Integer> getGenreHashMap(){
        for(Book book: this.books){
            if(this.genreHashMap.containsKey(book.getGenre())){
                int count = this.genreHashMap.get(book.getGenre());
                this.genreHashMap.put(book.getGenre(), count+=1);
            } else {
                this.genreHashMap.put(book.getGenre(), 1);
            }
        }
        return this.genreHashMap;
    }
}
