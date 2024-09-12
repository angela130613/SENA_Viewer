package edu.misena.senaviewer.model;

public class magazine extends Publication{
    int id;

    public magazine(String title, String editorialDate, String editorial){
        super(title, editorialDate, editorial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getRead() {
        return true;
    }
    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", title='" + getTitle() + '\'' +
                ", editorialDate='" + getEditorialDate() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", read=" + (getRead() ? "Yes" : "No") +
                '}';
    }
}