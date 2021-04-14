package genericCast;

import java.util.ArrayList;
import java.util.List;

public class FixedSizeStack<T> {
    //private int index = 0;
    //private Object[] storage;
    List<T> storage;
    public FixedSizeStack(int size) {
        storage = new ArrayList<>(size);
    }
    public void push(T item) { storage.add(item); }
    //@SuppressWarnings("unchecked")
    public T pop() { return storage.remove(storage.size()-1); }
    // я немного не понял какая ошибка должна быть.
    // У меня даже warning нету
}

