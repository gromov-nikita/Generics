package pets.rodents;

public class Rat extends Rodent {
    public Rat(String name) { super(name); }
    public Rat() { super(); }
    @Override
    public void speak() {
        System.out.println("Rodent :: Rat :: wee-wee");
    }
}
