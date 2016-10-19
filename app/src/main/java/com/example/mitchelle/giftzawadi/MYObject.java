package com.example.mitchelle.giftzawadi;

import android.os.Parcelable;

/**
 * Created by mitchelle on 10/5/16.
 */
public class MYObject {
    private String titleofchoice,describetitle,name;
    private int imagechoice;
    private int photo;
    private boolean favorite=false;

    public MYObject(String s, String s1, int sweetorsnack) {
    }


    /*public MYObject(String[] name, int[] photo) {
        this.name = name;
        this.photo = photo;
    }*/

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

    public String getDescribetitle() {
        return describetitle;
    }

    public void setDescribetitle(String describetitle) {
        this.describetitle = describetitle;
    }

    public String getTitleofchoice() {
        return titleofchoice;
    }

    public void setTitleofchoice(String titleofchoice) {
        this.titleofchoice = titleofchoice;
    }

    public int getImagechoice() {
        return imagechoice;
    }

    public void setImagechoice(int imagechoice) {
        this.imagechoice = imagechoice;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
