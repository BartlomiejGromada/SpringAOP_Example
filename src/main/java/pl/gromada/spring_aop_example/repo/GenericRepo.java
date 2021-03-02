package pl.gromada.spring_aop_example.repo;

public interface GenericRepo<K, E> {
    E get(K key);
    void add(E element);
}
