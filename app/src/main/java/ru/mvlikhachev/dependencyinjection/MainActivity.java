package ru.mvlikhachev.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        EngineFlap engineFlap = new EngineFlap();
//        CarEngine carEngine = new CarEngine(engineFlap);
//        CarBattery carBattery = new CarBattery();
//        CarChassis carChassis = new CarChassis();


        CarComponent carComponent = DaggerCarComponent.create();
//        car = carComponent.getCar();
        carComponent.inject(this);

        car.move();
    }
}