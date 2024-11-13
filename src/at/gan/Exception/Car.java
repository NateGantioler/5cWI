package at.gan.Exception;

import java.util.Random;

import at.gan.Exception.exceptions.CarException;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void StartEngine() throws CarException, Exception{

        Random r = new Random();
        if(r.nextBoolean()){
            throw new CarException("Gear Shaft is broken");
        }
        if(r.nextBoolean()){
            throw new Exception("No Cooling Liquid");
        }
        engine.Start();
    }

    public Engine getEngine() {
        return engine;
    }
}
