package animals;

public class Carnivore extends Animal {
    
    @Override // annotation which says this method is overridden.
    public void foodHabits() {
        System.out.println("I am a carnivore and I eat other animals.");
    }
}
