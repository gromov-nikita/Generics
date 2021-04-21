package pets.dogs;
public class Pug extends Dog {
    public Pug(String name) { super(name); }
    public Pug() { super(); }
    @Override
    public void speak() {
        System.out.println("Dog :: Pug :: woof");
    }
}
