package generic.ex1;

/**
 * 코드의 재사용성을 충족시켰으나, 타입의 안정성이 없다.
 */
public class ObjectBox {

    private Object value;

    public void set(Object object){
        this.value = object;
    }
    public Object get(){
        return value;
    }
}
