package com.example.malsacut;

class qr {

    int img ;
    String name , descreption;

    public qr(int img, String name, String descreption) {
        this.img = img;
        this.name = name;
        this.descreption = descreption;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDescreption() {
        return descreption;
    }
}
