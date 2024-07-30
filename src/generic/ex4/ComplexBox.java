package generic.ex4;

import generic.animal.Animal;

/**
 * 제네릭 타입과 제네릭 메서드에서 같은 타입 매개변수를 사용하는 경우
 * 제네릭 메서드의 우선순위가 높다.
 */
public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    /**
     * 제네릭 메서드는 제네릭 타입의 영향을 받지 않으므로 `extends Animal`의 영향을 받지 않는다.
     * 따라서 현재 제네릭 메서드의 타입 매개변수인 T는 Object의 기능만을 가진다.
     *
     * 기능적으로는 별개로 동작하지만 이름을 겹치게 사용하는건 혼란을 초래하기 때문에 같은 이름을 사용하지 말자.
     */
    public <T> T printAndReturn(T t){
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className = " + t.getClass().getName());
        return t;
    }
}
