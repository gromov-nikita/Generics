package pets.cats;

public class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() { super(); }
    @Override
    public void speak() {
        System.out.println("Cat :: Manx :: meow");
    }
}
