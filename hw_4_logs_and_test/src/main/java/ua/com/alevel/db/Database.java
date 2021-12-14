package ua.com.alevel.db;

import ua.com.alevel.entity.Author;
import ua.com.alevel.entity.Book;
import ua.com.alevel.exception.NotFoundException;
import ua.com.alevel.list.MyList;

import javax.swing.text.html.parser.Entity;
import java.util.UUID;

public class Database {

    private MyList<Author> authors;
    private MyList<Book> books;
    private static Database instance;

    private Database() {
        authors = new MyList<>();
        books  = new MyList<>();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void create(Book book, Long id) {
        if(authors.getSize() != 0){
            book.setBookName(String.valueOf(Entity.BOOK));
            book.setId(UUID.randomUUID().toString())
            book.setAuthorId();
            books.add(book);
        }else{
            book.setBookName(String.valueOf((Entity.BOOK)));
            book.setId(UUID.randomUUID().toString());
            book.getAuthorId();
            books.add(book);
        }
    }
    public void create(Author author) {
        author.setIdAuthor(String.valueOf(Entity.AUTHOR));
        authors.add(author);
    }


//    public void update(Book books) {
//        Book current = findById(books.getId());
//        current.setBookName(books.getBookName());
//        current.setAuthors(books.getAuthors());
//    }
//
//    public void delete(String id) {
//
//    }

//    public Book findById(String id) {
//        for (int i = 0; i < count; i++) {
//            if (id.equals(books[i].getId())) {
//                return books[i];
//            }
//        }
//        throw new NotFoundException("User not found for id " + id);
//    }
//
//
//    public Book[] findAll() {
//        return books;
//    }
//
//    public boolean existByEmail(String email) {
//        for (int i = 0; i < count; i++) {
//            if (email.equals(books[i].getAuthors())) {
//                return true;
//            }
//        }
//        return false;
//    }
    public enum Entity {
        AUTHOR, BOOK
    }
}
