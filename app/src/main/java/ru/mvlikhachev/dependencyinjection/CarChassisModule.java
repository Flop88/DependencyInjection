package ru.mvlikhachev.dependencyinjection;

import dagger.Module;
import dagger.Provides;

@Module
public class CarChassisModule {

    @Provides
    static CarChassis provideCarChassis() {
        return new CarChassis();
    }

}
