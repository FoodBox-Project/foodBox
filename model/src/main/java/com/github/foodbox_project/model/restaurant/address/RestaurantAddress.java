package com.github.foodbox_project.model.restaurant.address;

import com.github.foodbox_project.model.address.city.City;

import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class RestaurantAddress {

    private Integer id;
    private City city;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestaurantAddress)) return false;
        RestaurantAddress that = (RestaurantAddress) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
