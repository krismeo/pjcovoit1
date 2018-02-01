package fr.ipme.covoiturage.modeles;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private Brand brand;
    @Column
    private String model;
    @Column
    private int numberOfPlaces;

    @OneToMany
    private List<Trip> trip;

    public Car(){

    }

    public Car(int id, Brand brand, String model, int numberOfPlaces) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public List<Trip> getTrip() {
        return trip;
    }

    public void setTrip(List<Trip> trip) {
        this.trip = trip;
    }
}
