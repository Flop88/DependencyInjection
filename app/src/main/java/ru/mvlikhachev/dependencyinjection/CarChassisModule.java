package ru.mvlikhachev.dependencyinjection;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class CarChassisModule {

    private int weight;
    public static final String TAG = "CarTag";

    @Provides
    CarChassis provideCarChassis() {
        return new CarChassis();
    }

    public CarChassisModule(int weight) {
        Log.d(TAG, "Car chassis weight is " + weight);
        this.weight = weight;
    }
}
