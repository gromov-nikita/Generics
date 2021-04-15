public abstract class GenericType<T extends GenericType<T>> {
    public abstract T returnT(T type);
    public T useReturnT(T obj) {
        return returnT(obj);
    }
}
