package zoo;

public class Cat extends Animal {

    public boolean hasFur;
    public int numberOfWhiskers;
    private int lives = 9;

    // Constructor parameter
    public Cat(String name, String species, String food, boolean hasFur, int numberOfWhiskers) {
        super(name, species, food);
        this.hasFur = hasFur;
        this.numberOfWhiskers = numberOfWhiskers;
    }

    // Polymorphism
    public void makeSound() {
        System.out.println("Meooooowwwww");
    }

}
