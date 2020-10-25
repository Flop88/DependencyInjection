package ru.mvlikhachev.dependencyinjection;

public class CarEngine {

    private EngineFlap engineFlap;

    public CarEngine(EngineFlap engineFlap) {
        this.engineFlap = engineFlap;
    }
}
