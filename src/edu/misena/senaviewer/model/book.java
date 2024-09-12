package edu.misena.senaviewer.model;

public class book extends Publication{
    int id;
    String isbn;
    boolean readed;
    int timeReaded;

    public book(String title, String editorialDate, String editorial, String isbn){
        super(title, editorialDate, editorial);
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public boolean getReaded() {
        return true;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }
}