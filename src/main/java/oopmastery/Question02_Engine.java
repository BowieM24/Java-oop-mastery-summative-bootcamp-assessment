package oopmastery;

public class Question02_Engine {

    private boolean running;
    

    public void start() {
        running = true;
    }

    public void stop() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }
}
