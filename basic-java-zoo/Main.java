import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

public class Main {
    public static void main(String[] args) {

        // Animal gajah = new Animal("Gajah", "Mamalia", "Herbivore");
        // Animal macan = new Animal("Macan", "Mamalia", "Carnivore");
        Animal bsh = new Cat("Bubu", "British Short Hair", "Omnivora", true, 3);
        Animal samoyed = new Dog("Jeo", "Samoyed", "Omnivora");

        System.out.println("Apakah berbulu mengnya " + bsh.food);
        System.out.println("Cat name: " + bsh.name);
        System.out.println("Cat species: " + bsh.species);
        bsh.makeSound();

        System.out.println("Dog name: " + samoyed.name);
        System.out.println("Dog species: " + samoyed.species);
        samoyed.makeSound();

        // System.out.println("Nama Hewan: " + gajah.name);
        // System.out.println("Makanan " + gajah.food);
        // System.out.println("Apakah lapar: " + gajah.isHungry());
        // System.out.println("Nama Hewan: " + macan.name);
        // System.out.println("Makanan " + macan.food);
        // System.out.println("Apakah capek: " + macan.isTired());
    }
}