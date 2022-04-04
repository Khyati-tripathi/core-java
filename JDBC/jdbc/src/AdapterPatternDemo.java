interface Bird {
    public void fly();

    public void makeSound();
}

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Flying...");
    }

    public void makeSound() {
        System.out.println("Chirp chirp");
    }
}

class Duck implements Bird {
    public void fly() {
        System.out.println("Flying...");
    }

    public void makeSound() {
        System.out.println("Quack quack");
    }
}

interface ToyBird {
    public void squeak();
}

class ToyDuck implements ToyBird {
    public void squeak() {
        System.out.println("Squeaking noise");
    }
}

class ToySparrow implements ToyBird {
    public void squeak() {
        System.out.println("Squeaking noise");
    }
}

class BirdAdapter implements ToyBird {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSound();
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Bird duck = new Duck();
        ToyBird toyDuck = new ToyDuck();

        // Wrap a bird in a birdAdapter so that it behaves like a toy bird
        BirdAdapter birdAdapter = new BirdAdapter(duck);

        System.out.println("Demonstrating a real bird::");
        duck.fly();
        duck.makeSound();

        System.out.println("Demonstrating a toy bird::");
        toyDuck.squeak();

        System.out.println("Making a toy bird behave like a real bird via bird adapter::");
        birdAdapter.squeak();

        Bird sparrow = new Sparrow();
        ToySparrow toySparrow = new ToySparrow();
        BirdAdapter birdAdapter1 = new BirdAdapter(sparrow);
        System.out.println("Demonstrating a real sparrow::");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("Demonstrating a toy sparrow::");
        toySparrow.squeak();

        System.out.println("Making a toy bird behave like a real sparrow via bird adapter::");
        birdAdapter1.squeak();
    }

}