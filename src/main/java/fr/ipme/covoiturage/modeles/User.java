package fr.ipme.covoiturage.modeles;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String password;
    @ManyToOne
    private Car car;
    public User(){

    }
    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
