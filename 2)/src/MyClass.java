import java.util.ArrayList;
import java.util.List;

public class MyClass<T> {
    private T obj1;
    private T obj2;
    private T obj3;
    public MyClass(T arg1, T arg2, T arg3) {
        obj1 = arg1;
        obj2 = arg2;
        obj3 = arg3;
    }
    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }
    public void setObj2(T obj2) {
        this.obj2 = obj2;
    }
    public void setObj3(T obj3) {
        this.obj3 = obj3;
    }
    public T getObj1() {
        return obj1;
    }
    public T getObj2() {
        return obj2;
    }
    public T getObj3() {
        return obj3;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                '}';
    }
}
