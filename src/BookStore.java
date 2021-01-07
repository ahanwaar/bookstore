import java.util.List;

public class BookStore {
    private List<Book> bookList;
    private List<Author> authorList;

    public BookStore(List<Book> bookList, List<Author> authorList) {
        this.bookList = bookList;
        this.authorList = authorList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}
