package classTypeCapture;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture<T> {
    private Class<T> kind;
    private Map<String,Class<?>> mapKind = new HashMap<>();
    public ClassTypeCapture() {
    }
    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }
    public Class<T> getKind() {
        return kind;
    }
    public Map<String, Class<?>> getMapKind() {
        return mapKind;
    }
    public void addType(String typeName, Class<?> kind) {
        if(!typeName.equals(kind.getSimpleName())) {
            throw new IllegalArgumentException(typeName + " != " + kind.getSimpleName());
        }
        mapKind.put(typeName,kind);
    }
    public Object create(String typeName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return Class.forName(typeName).getConstructor().newInstance();
    }
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        /*
        ClassTypeCapture<Building> ctt1 =
                new ClassTypeCapture<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 =
                new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
        */
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>();
        System.out.println(ctt1.create(Building.class.getName()).getClass().getName());
        System.out.println(ctt1.create(House.class.getName()).getClass().getName());
        ctt1.addType(House.class.getSimpleName(),House.class);
        ctt1.addType(Building.class.getSimpleName(),Building.class);
        System.out.println(ctt1.getMapKind().toString());
        System.out.println(ctt1.create("err"));// выводятся ошибки
        ctt1.addType("Err",Building.class);



    }
}
