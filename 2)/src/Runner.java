/*
Exercise 2: (1) Create a holder class that holds three objects of the same type, along with
the methods to store and fetch those objects and a constructor to initialize all three.
 */
public class Runner {
    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>(1,2,3);
        System.out.println(obj.toString());
        obj.setObj1(4);
        obj.setObj2(5);
        obj.setObj3(6);
        System.out.println(obj.getObj1());
        System.out.println(obj.getObj2());
        System.out.println(obj.getObj3());
    }
}
