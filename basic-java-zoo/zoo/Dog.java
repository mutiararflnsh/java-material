package zoo;

public class Dog extends Animal {

    // Constructor parameter
    public Dog(String name, String species, String food) {
        super(name, species, food);
    }

    // Polymorphism
    public void makeSound() {
        System.out.println("Guk Guk");
    }
}
