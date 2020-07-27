package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect
public class Ad implements Serializable {

    private String title;
    private int id;


    public Ad(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public Ad() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void get() {
    }
}
