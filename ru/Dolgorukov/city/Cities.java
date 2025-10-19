package ru.Dolgorukov.city;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Cities {
    private String cityName;
    private ArrayList<Way> ways;

    public Cities() {
        this.ways = new ArrayList<>();
    }

    public Cities(String cityName) {
        this.cityName = cityName;
        this.ways = new ArrayList<>();
    }

    public Cities(String cityName, ArrayList<Way> ways) {
        this.cityName = cityName;
        if (checkList(ways)) {
            this.ways = new ArrayList<>(ways);
        } else {
            throw new IllegalArgumentException("Ошибка добавления спика: между двумя городами может быть только одна прямая дорога");
        }
    }

    public String toString() {
        String str;
        str = "Город: " + cityName + "\n";
        str += "Дороги: ";
        for (int i = 0; i < ways.size(); i++) {
            str = str + ways.get(i).getTitle() + ":" + ways.get(i).getPrice() + " ";
        }
        return str;
    }

    public String getCityName() {
        return cityName;
    }

    public ArrayList<Way> getWays() {
        return new ArrayList<>(ways);
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setWays(ArrayList<Way> ways) {
        this.ways = new ArrayList<>(ways);
    }

    public void addWay(String title, int price){
        boolean flag = true;
        for (int i = 0; i < this.ways.size(); i++){
            if (this.ways.get(i).getTitle() == title){
                flag = false;
                System.out.println("Дорога не может быть добавлена, в этот город уже есть дорога");
            }
        }
        if (flag == true) {
            Way way = new Way(title, price);
            this.ways.add(way);
        }
    }

    public void deleteWay(int index){
        this.ways.remove(index);
    }

    public boolean checkList(ArrayList<Way> ways) {
        HashSet<String> titleSet = new HashSet<>();
        for (int i = 0; i < ways.size(); i++) {
            Way way = ways.get(i);
            titleSet.add(way.getTitle());
        }
        if (titleSet.size() == ways.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Cities cities = (Cities) object;
        return Objects.equals(ways, cities.ways);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ways);
    }
}
