package models;

import java.awt.*;

public class Movie {

    private int id;
    private String title;
    private String imageUrl;
    private Genre genre;

    public Image getImg() {
        return img;
    }

    private Image img;          //постер/обложка фильма

    public Movie(){
        this.id++;
    }
    public Movie(int id) {
        this.id = id;
    }
    public Movie(int id,String title,Image img){
        this.id=id;
        this.title=title;
        this.img=img;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


}
