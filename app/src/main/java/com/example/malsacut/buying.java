package com.example.malsacut;

public class buying {

            String  nameproduct , price ;
 int img;
    public buying(String nameproduct, String price, int img) {
        this.img = img;
        this.nameproduct = nameproduct;
        this.price = price;
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

}
