package ru.Dolgorukov.city;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Route {
    private Cities startCity;
    private Cities endCity;
    private Cities[] allCities;

    public Route(Cities startCity, Cities endCity, Cities[] allCities) {
        if (startCity == null || endCity == null) {
            throw new IllegalArgumentException("Должны быть города начала и конца");
        }
        this.startCity = startCity;
        this.endCity = endCity;
        this.allCities = allCities;
    }

    public Route(Cities startCity, Cities endCity) {
        this(startCity, endCity, null);
    }

    public Cities getStartCity() {
        return startCity;
    }

    public Cities getEndCity() {
        return endCity;
    }

    public void setStartCity(Cities startCity) {
        if (startCity == null) {
            throw new IllegalArgumentException("Должен быть город начала");
        }
        this.startCity = startCity;
    }

    public void setEndCity(Cities endCity) {
        if (endCity == null) {
            throw new IllegalArgumentException("Должен быть город конца");
        }
        this.endCity = endCity;
    }

    public void setAllCities(Cities[] allCities) {
        this.allCities = allCities;
    }

    private Cities findCity(String cityName) {
        if (allCities == null) {
            return null;
        }
        for (int i = 0; i < allCities.length; i++) {
            Cities city = allCities[i];
            if (city.getCityName().equals(cityName)) {
                return city;
            }
        }
        return null;
    }

    public Cities[] getRoute() {
        if (allCities == null) {
            return new Cities[0];
        }
        if (startCity.equals(endCity)) {
            return new Cities[]{startCity};
        }
        return findRoad();
    }

    private Cities[] findRoad() {
        List<Cities> currentPath = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        if (searchRoad(startCity, currentPath, visited)) {
            return currentPath.toArray(new Cities[0]);
        }
        return new Cities[0];
    }

    private boolean searchRoad(Cities currentCity, List<Cities> currentPath, Set<String> visited) {
        currentPath.add(currentCity);
        visited.add(currentCity.getCityName());
        if (currentCity.getCityName().equals(endCity.getCityName())) {
            return true;
        }
        ArrayList<Way> ways = currentCity.getWays();
        for (int i = 0; i < ways.size(); i++) {
            Way way = ways.get(i);
            Cities neighbor = findCity(way.getTitle());
            if (neighbor != null && !visited.contains(neighbor.getCityName())) {
                if (searchRoad(neighbor, currentPath, visited)) {
                    return true;
                }
            }
        }
        currentPath.remove(currentPath.size() - 1);
        visited.remove(currentCity.getCityName());
        return false;
    }

    @Override
    public String toString() {
        Cities[] route = getRoute();
        if (route.length == 0) {
            return "Маршрут не найден";
        }
        String routestr = "";
        for (int i = 0; i < route.length; i++) {
            routestr += route[i].getCityName() + " ";
        }
        return routestr;
    }
}