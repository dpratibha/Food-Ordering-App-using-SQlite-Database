
package com.example.movielist;

import java.io.Serializable;

//2.  create movie class
// 3. copy image in deawable floder
public class Movie  implements Serializable {
    private String name;
    private  String gender;
    private  double price;
    private double rating;
    private  String cast;
    private  int image;


    public Movie() {
    }

    public Movie(String name, String gender, double price, double rating, String cast, int image) {
        this.name = name;
        this.gender = gender;
        this.price = price;
        this.rating = rating;
        this.cast = cast;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", cast='" + cast + '\'' +
                ", image=" + image +
                '}';
    }
}
