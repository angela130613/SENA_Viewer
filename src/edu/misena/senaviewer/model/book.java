package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.List;

public class book {
    int id;
    String  title;
    Date editorialDate;
    String editorial;
    List<String> authors;
    String isbn;
    boolean readed;
    int timeReaded;

    public  book(String title, Date editorialDate, String editorial, String isbn){
        this.title = title;
       this.editorialDate = editorialDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Date getEditorialDate() {
        return editorialDate;
    }

    public void setEditorialDate(Date editorialDate){
        this.editorialDate = editorialDate;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
}


