package com.example.carlogoinformation;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public  static ArrayList<Car> cars;
    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<Car>();

        cars.add(new Car("E180", "mercedes", "Ahmet Çelik","5646565656"));
        cars.add(new Car("Juke", "nissan", "Veli Demir","5665612356"));
        cars.add(new Car("Polo", "volkswagen", "Ayşe Yazı","566566562"));
        cars.add(new Car("E180", "mercedes", "Ahmet Çelik","5646565656"));
        cars.add(new Car("Juke", "nissan", "Veli Demir","5665612356"));
        cars.add(new Car("Polo", "volkswagen", "Ayşe Yazı","566566562"));

    }
}
