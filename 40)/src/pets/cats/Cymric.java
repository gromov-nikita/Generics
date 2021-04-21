package pets.cats;

public class Cymric extends Cat {
    public Cymric(String name) { super(name); }
    public Cymric() { super(); }

    @Override
    public void speak() {
        System.out.println("Cat :: Cymric :: meow");
    }
}
