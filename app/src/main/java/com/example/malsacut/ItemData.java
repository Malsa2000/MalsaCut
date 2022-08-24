package com.example.malsacut;

class ItemData {
    String name_product , price , img;

    public ItemData(String name_product, String price ,String imge) {
        this.name_product = name_product;
        this.price = price;
        this.img = imge;

    }

    public String getName_product() {
        return name_product;
    }

    public String getPrice() {
        return price;
    }

    public String getimg() {
        return img;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
