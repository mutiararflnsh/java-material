package zoo;

public abstract class Animal {
    public static final String hasFur = null;
    public String name;
    public String species;
    public String food;
    private int energy = 25;
    private int hungerLevel = 0;

    public Animal(String name, String species, String food) {
        this.name = name;
        this.species = species;
        this.food = food;
    }

    // // Breaking Encapsulation
    // public void setEnergy(int energy) {
    // this.energy = energy;
    // }

    // public int getEnegery() {
    // return this.energy;
    // }

    // Tell Dont Ask

    public boolean isHungry() {
        return this.hungerLevel >= 50;
    }

    public boolean isTired() {
        return this.hungerLevel < 10;
    }

    public void sleep() {
        this.energy++;
        this.hungerLevel++;
    }

    public abstract void makeSound();
}
