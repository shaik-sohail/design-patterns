package abstractFactoryDP;

public interface AbstractFactory<T> {
    T create(String type);
}
