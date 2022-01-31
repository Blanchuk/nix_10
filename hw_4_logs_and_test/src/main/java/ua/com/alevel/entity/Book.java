package ua.com.alevel.entity;

import ua.com.alevel.list.MyList;

public class Book {

    private String id;
    private String bookName;
    private String authorId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
               "id='" + id + '\'' +
               ", bookName='" + bookName + '\'' +
               ", authorId='" + authorId + '\'' +
               '}';
    }
}
