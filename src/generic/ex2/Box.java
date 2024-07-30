package generic.ex2;

/**
 * 동물들을 보관할 박스
 * @param <T>
 */
public class Box<T> {

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
