package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question02_CarTest {

    @Test
    void engineShouldStart() {
        Question02_Engine engine =
                new Question02_Engine();

        engine.start();

        assertTrue(
                engine.isRunning()
        );
    }

    @Test
    void engineShouldStop() {
        Question02_Engine engine =
                new Question02_Engine();

        engine.start();
        engine.stop();

        assertFalse(
                engine.isRunning()
        );
    }

    @Test
    void carShouldStartEngine() {
        Question02_Car car =
                new Question02_Car();

        car.startCar();

        assertTrue(
                car.isCarRunning()
        );
    }

    @Test
    void carShouldStopEngine() {
        Question02_Car car =
                new Question02_Car();

        car.startCar();
        car.stopCar();

        assertFalse(
                car.isCarRunning()
        );
    }

    @Test
    void newCarShouldBeStopped() {
        Question02_Car car =
                new Question02_Car();

        assertFalse(
                car.isCarRunning()
        );
    }
}
