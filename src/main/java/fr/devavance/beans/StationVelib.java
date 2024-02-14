package fr.devavance.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stationvelib")
public class StationVelib {
    @Id
    @GeneratedValue
    private int id;

    private String fullAdress;
    private String adress;
    private Double latitude;
    private Double longitude;
    private int open;
    private int bonus;
    private int number;
    private String name;

    public StationVelib() {}

    public StationVelib(String name, String adress, int bonus, String fullAdress, Double lat, Double lng, int number, int open) {
        this.name = name;
        this.fullAdress = fullAdress;
        this.adress = adress;
        this.latitude = lat;
        this.longitude = lng;
        this.open = open;
        this.bonus = bonus;
        this.number = number;
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

    public String getFullAdress() {
        return fullAdress;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
