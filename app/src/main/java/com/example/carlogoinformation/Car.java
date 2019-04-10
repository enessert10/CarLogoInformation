package com.example.carlogoinformation;

public class Car {

    private String Model;
    private String Make;
    private String Owner;
    private String Tel;

    public Car(String model, String make, String owner, String tel) {
        Model = model;
        Make = make;
        Owner = owner;
        Tel = tel;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }
}
