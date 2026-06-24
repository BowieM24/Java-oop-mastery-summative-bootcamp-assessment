package oopmastery;

public class Question02_Car {

    private Question02_Engine engine;

    public Question02_Car() {
        engine = new Question02_Engine();
    }

    public void startCar() {
        engine.start();
        }

    public void stopCar() {
        engine.stop();
    }

    public boolean isCarRunning() {
        return engine.isRunning();
    }
}
