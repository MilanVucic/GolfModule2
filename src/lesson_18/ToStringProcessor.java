package lesson_18;

import java.lang.reflect.Field;

public class ToStringProcessor {
    public static String stringify(Object object) {
        Class<?> clazz = object.getClass();
        ToString toString = clazz.getDeclaredAnnotation(ToString.class);
        if (toString == null) {
            throw new IllegalArgumentException("Class " + clazz.getName() + " must be marked with @ToString");
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (toString.includeClassName()) {
            stringBuilder.append(clazz.getSimpleName()).append("\n");
        }
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            try {
                ToStringIgnoreField ignore = field.getDeclaredAnnotation(ToStringIgnoreField.class);
                if (ignore != null) {
                    continue;
                }
                field.setAccessible(true);
                if (toString.includeFieldNames()) {
                    ToStringFieldName stringFieldName = field.getDeclaredAnnotation(ToStringFieldName.class);
                    stringBuilder.append(stringFieldName == null ?
                                    field.getName() : stringFieldName.value())
                            .append(" = ");
                }
                stringBuilder.append(field.get(object))
                        .append("\n");
                field.setAccessible(false);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
