import java.lang.reflect.*;

public class q39_ReflectionExample {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionExample");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
            Class<?>[] params = m.getParameterTypes();
            for (Class<?> p : params) {
                System.out.println(" Parameter type: " + p.getName());
            }
        }
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getDeclaredMethod("sayHello", String.class);
        method.invoke(obj, "World");
    }
}
