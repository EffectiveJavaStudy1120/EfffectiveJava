package com.effective.java.item5_bumsu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Class 하나 이상의 자원에 의존할 때
// Engine 인터페이스
interface Engine {
    void start();
}

// GasolineEngine 구현체
class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gasoline Engine started");
    }
}

// ElectricEngine 구현체
class ElectricEngine implements Engine {
    //컴파일러 경고 and 가독성 위해 override
    @Override
    public void start() {
        System.out.println("Electric Engine started");
    }
}
class Car {
    private Engine engine;

    // 생성자 주입(Constructor Injection)
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car started");
    }
}

public class item5_1 {
    @Test
    public void testGasolineEngineStart() {
        Engine gasolineEngine = new GasolineEngine();
        Car gasolineCar = new Car(gasolineEngine);
        gasolineCar.start();
    }

    @Test
    public void testElectricEngineStart() {
        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start();
    }
}
