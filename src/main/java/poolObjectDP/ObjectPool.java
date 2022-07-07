package poolObjectDP;
import java.util.*;

abstract class ObjectPool<T> {
    HashSet<T> _lock,_unlock ;
    ObjectPool(){
        _lock = new HashSet<T>();
        _unlock = new HashSet<T>();
    }
    abstract T print();
    abstract boolean validate(T o);
    abstract void dead(T o);
    synchronized T takeOut(){
        T o;

        if(_unlock.size()>0){
            for (T t:_unlock) {
                if (validate(t)) {
                    _unlock.remove(t);
                    _lock.add(t);
                    System.out.println("Already existing");
                    return t;
                } else {
                    _unlock.remove(t);
                    dead(t);
                }
            }
        }
        o=print();
        _lock.add(o);
        System.out.println("Initialized");
        return o;
    }
    synchronized void takeIn(T t){
        _lock.remove(t);
        _unlock.add(t);
        System.out.println("Added back to pool");
    }


}
