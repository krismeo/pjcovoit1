package fr.ipme.covoiturage.modeles;

import javax.persistence.*;

@Entity
public class Trip {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private double price;
    @ManyToOne
    private Car car;

    public Trip() {

    }

    public Trip(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
