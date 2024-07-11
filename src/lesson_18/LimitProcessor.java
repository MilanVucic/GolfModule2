package lesson_18;

import java.lang.reflect.Field;

public class LimitProcessor {
    public static boolean checkLimits(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Limit limit = field.getAnnotation(Limit.class);

            if (limit != null) {
                double min = limit.min();
                double max = limit.max();
                field.setAccessible(true);
                try {
                    double value = (double) field.get(object);
                    if (value < min || value > max) {
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException("@Limit must be used on numerical fields only!");
                } finally {
                    field.setAccessible(false);
                }
            }
        }
        return true;
    }
}
