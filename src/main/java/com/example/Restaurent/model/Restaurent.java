package com.example.Restaurent.model;

public class Restaurent {
    private String name;
    private String city;
    private String no;
    private String specialist;

    public Restaurent() {
    }

    public Restaurent(String name, String city, String no, String specialist) {
        this.name = name;
        this.city = city;
        this.no = no;
        this.specialist = specialist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Restaurent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", no='" + no + '\'' +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
