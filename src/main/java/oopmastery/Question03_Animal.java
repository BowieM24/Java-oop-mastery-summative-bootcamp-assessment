package oopmastery;

public abstract class Question03_Animal {

    protected String name;

    public Question03_Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}
