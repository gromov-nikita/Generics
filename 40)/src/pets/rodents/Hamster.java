package pets.rodents;

public class Hamster extends Rodent {
    public Hamster(String name) { super(name); }
    public Hamster() { super(); }
    @Override
    public void speak() {
        System.out.println("Rodent :: Hamster :: wee-wee");
    }
}
