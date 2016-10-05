package com.example.mitchelle.giftzawadi;

/**
 * Created by mitchelle on 10/5/16.
 */
public class MYObject {
    private String name;
    private int photo;

    public MYObject(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
