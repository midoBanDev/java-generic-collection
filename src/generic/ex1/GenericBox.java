package generic.ex1;

/**
 * 코드 재사용성과 타입 안정성을 가진다.
 * @param <T>
 */
public class GenericBox<T> {

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
