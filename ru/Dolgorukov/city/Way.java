package ru.Dolgorukov.city;

import java.util.Objects;

public class Way {
    private String title;
    private int price;

    public Way(){
        this.title = null;
        this.price = 0;
    }

    public Way(String title, int price) {
        this.title = title;
        this.price = 0;
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Стоимоть не может быть меньше 0 (установлено стандартное значение 0)");
            this.price = 0;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitlePrice(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Way way = (Way) o;
        return price == way.price && Objects.equals(title, way.title);
    }

    @Override
    public String toString() {
        return title + ":" + price;
    }
}
