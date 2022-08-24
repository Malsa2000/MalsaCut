package com.example.malsacut;

public class product {

    // int ;
    String  nameproduct, price, ocasyon;
    int img;

    public product(int img, String nameproduct, String price, String ocasyon) {
        this.img = img;
        this.nameproduct = nameproduct;
        this.price = price;
        this.ocasyon = ocasyon;
    }

    public int getImg() {
        return img;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public String getPrice() {
        return price;
    }

    public String getOcasyon() {
        return ocasyon;
    }


}
