public class SixTuple<T1,T2,T3,T4,T5,T6> {
    public T1 obj1;
    public T2 obj2;
    public T3 obj3;
    public T4 obj4;
    public T5 obj5;
    public T6 obj6;
    public SixTuple(T1 obj1, T2 obj2, T3 obj3, T4 obj4, T5 obj5, T6 obj6) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
        this.obj4 = obj4;
        this.obj5 = obj5;
        this.obj6 = obj6;
    }
    @Override
    public String toString() {
        return "SixTuple{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                ", obj4=" + obj4 +
                ", obj5=" + obj5 +
                ", obj6=" + obj6 +
                '}';
    }
}
