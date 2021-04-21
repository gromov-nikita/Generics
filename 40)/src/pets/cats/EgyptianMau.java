package pets.cats;

public class EgyptianMau extends Cat {
    public EgyptianMau(String name) { super(name); }
    public EgyptianMau() { super(); }
    @Override
    public void speak() {
        System.out.println("Cat :: EgyptianMau :: meow");
    }
}
