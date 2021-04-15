/*
Exercise 34: (4) Create a self-bounded generic type that contains an abstract method
that takes an argument of the generic type parameter and produces a return value of the
generic type parameter. In a non-abstract method of the class, call the abstract method
and return its result. Inherit from the self-bounded type and test the resulting class.
 */
public class Runner extends GenericType {
    @Override
    public GenericType returnT(GenericType type) {
        return type;
    }
    @Override
    public String toString() {
        return "Runner";
    }
    public static void main(String[] args) {
        Runner obj = new Runner();
        System.out.println(obj.useReturnT(obj).toString());
    }
}
