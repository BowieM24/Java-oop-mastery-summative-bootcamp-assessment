package oopmastery;

public class Question03_Dog extends Question03_Animal {

    public Question03_Dog(String name) {
        super(name);
        
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
