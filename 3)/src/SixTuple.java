public class SixTuple<T1,T2,T3,T4,T5,T6> {
    public final T1 obj1;
    public final T2 obj2;
    public final T3 obj3;
    public final T4 obj4;
    public final T5 obj5;
    public final T6 obj6;
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
