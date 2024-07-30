package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

/**
 * 제네릭 타입과 상환
 * @param <T>
 */
public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t){
        this.unit = t;
    }

    public void showInfo(){
        System.out.println("이름 : " + unit.getName() + ", 체력 : " + unit.getHp());
    }

    public T out(){
        return unit;
    }
}
