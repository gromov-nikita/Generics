public class GenericMethods {
    public <T> void f(T x, int t) {
        System.out.println(x.getClass().getName() + " " + t);
    }
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 4);
        gm.f(1, 5);
        gm.f(1.0, 6);
        gm.f(1.0F, 7);
        gm.f('c', 8);
        gm.f(gm, 9);
    }
}