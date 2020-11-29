package io.by.model;


public class Product {
    private String id;
    private String title;
    private int price;
    private String category;

    public Product() {
    }

    public Product(String id, String title, int price, String category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
