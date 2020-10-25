package ru.mvlikhachev.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class LithiumIonBattery implements CarBattery{

    public static final String TAG = "CarTag";

    @Inject
    public LithiumIonBattery() {
    }

    @Override
    public void logBatteryType() {
        Log.d(TAG, "This is A Lithium-Ion Battery");
    }
}
