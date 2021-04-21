package pets.dogs;

public class Mutt extends Dog {
    public Mutt(String name) { super(name); }
    public Mutt() { super(); }
    @Override
    public void speak() {
        System.out.println("Dog :: Mutt :: woof");
    }
}
