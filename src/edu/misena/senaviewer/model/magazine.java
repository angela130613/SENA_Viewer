package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.List;

public class magazine {
    int id;
    String title;
    Date editorialDate;
    String editorial;
    List<String> authors;

    public magazine(String title, Date editorialDate, String editorial){
        this.title = title;
        this.editorialDate = editorialDate;
        this.editorial = editorial;
    }

}
