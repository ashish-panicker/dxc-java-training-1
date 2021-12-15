package animals;

public class Herbivore extends Animal{
    
    @Override // annotation which says this method is overridden.
    public void foodHabits() {
        System.out.println("I am a herbivore and I eat plants.");
    }
}
