package pets;

public abstract class Pet extends Individual {
    public Pet(String name) { super(name); }
    public Pet() { super(); }
    public abstract void speak();
}
