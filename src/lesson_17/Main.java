package lesson_17;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProxyExample proxyExample = new ProxyImpl();
        ProxyExample proxy = (ProxyExample) Proxy.newProxyInstance(proxyExample.getClass().getClassLoader(),
                proxyExample.getClass().getInterfaces(), new CustomInvocationHandler(proxyExample));

        proxy.doSomething();
    }

    private static void constructorExample() {
        Class<ReflectionExample> clazz = ReflectionExample.class;
        ReflectionExample r = new ReflectionExample(55);
        try {
            Constructor<ReflectionExample> constructor = clazz.getDeclaredConstructor(int.class);
            ReflectionExample r2 = constructor.newInstance(5544);
            System.out.println(r2.getA());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void changingPrivateFieldExample(Class<ReflectionExample> clazz, ReflectionExample r) {
        try {
            Field field = clazz.getDeclaredField("a");
            field.setAccessible(true);
            field.set(r, 100);
            System.out.println(r.getA());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void invokingAMethodExample(Class<ReflectionExample> clazz, ReflectionExample r) {
        try {
            Method method = clazz.getDeclaredMethod("method1", String.class);
            method.setAccessible(true);
            method.invoke(r, "Hello");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void displayMethodInfo(Class<ReflectionExample> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getGenericParameterTypes()));
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println("-----------");
        }
    }

    private static void displayFieldInfo(Class<ReflectionExample> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType());
            System.out.println(field.getName());
            System.out.println(field.getModifiers());
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println("------------------");
        }
    }
}
