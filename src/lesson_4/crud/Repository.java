package lesson_4.crud;

public interface Repository<T> {
    void create(T element);
    T retrieve(long id);
    void update(T element);
    void delete(long id);
}
