package ru.mvlikhachev.dependencyinjection;

import dagger.Component;

@Component(modules = CarChassisModule.class)
public interface CarComponent {

    Car getCar();

}
