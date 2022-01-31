package ua.com.alevel.entity;

import ua.com.alevel.list.MyList;

public class Author {
    private String id;
    private String name;
    private int age;
    private MyList<Book> listBook;

    public MyList<Book> getListBook() {
        return listBook;
    }

    public void setListBook(MyList<Book> listBook) {
        this.listBook = listBook;
    }

    public String getIdAuthor() {
        return id;
    }

    public void setIdAuthor(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Books{" +
               "id='" + id + '\'' +
               ", authorName ='" + name + '\'' +
               ", booksList=" + listBook +
               '}';
    }
}
