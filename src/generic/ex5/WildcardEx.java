package generic.ex5;

import generic.animal.Animal;
import generic.animal.Dog;

/**
 * 와일드 카드
 * 와일드 카드는 제네릭이 아니다.
 * 와일드 카드는 모든 타입을 받을 수 있다.
 * <?> 것만 사용해서 모든 타입을 받을 수 있는 와일드 카드를 `비제한 와일드 카드`라 부른다.
 *
 * 와일드 카드도 제네릭 타입, 제네릭 메서드와 마찬가지로 상환을 둘 수 있다.
 * <? extends Animal> 을 사용하여 와일드 카드에 상환을 둘 수 있다. 이를 `상환 와일드 카드` 라 부른다.
 */
public class WildcardEx {

    /**
     * 제네릭 메서드
     * <T> : 타입 매개변수
     * Box<Dog>가 인자로 들어오면, T를 Dog 치환하는 타입 추론이 일어난다.
      */

    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }

    /**
     * 제네릭 타입을 매개변수로 받는 일반 메서드이다.
     * 하지만 위 제네릭 메서드와 동일한 기능을 제공한다.
     * ? == ? extends Object 를 의미한다.
     *
     * 제네릭 메서드는 타입 추론으로 인해 복잡한 실행 과정을 거친다.
     * 반면, 와이드 카드는 일반 메서드에서 사용되기 때문에 복잡한 과정없이 단순히 매개변수의 역할을 수행할 뿐이다.
     * 따라서 제네릭 타입이나 제네릭 메서드를 꼭 정의해야 하는 상황이 아니라면 와이드 카드 사용을 권장한다.
     * Q)제네릭 타입 대신 와일드 카드를 사용하라고? 그럼 제네릭 타입에는 와이드 카드를 어떻게 사용하는거지?
     *
      */
    static void printWildcardV1(Box<?> box){
        System.out.println("T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        System.out.println("이름 = " + box.get().getName());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        System.out.println("이름 = " + box.get().getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    /**
     * 제네릭 메서드를 사용해야 하는 경우.
     * 제네릭 메서드(또는 제네릭 타입)는 타입 인자를 전달 받으면 해당 타입으로 반환이 가능하다.
     * 하지만 와일드 카드는 단순히 일반 메서드의 매개변수이기 때문에 반환 타입을 메서드 실행 시점에 변경할 수 없다.
     *
     * 아래 메서드와 같이 상환 와일드 카드인 경우
     * Box<Dog> 타입이 인자로 전달 된 경우 클라이언트 입장에서는 반환이 Dog 되기를 원한다.
     * 하지만 (상환)와일드 카드를 사용한 (일반)메서드의 경우 반환 타입을 메서드 작성 시점에 미리 지정해야 한다.
     * 이때 다형성을 활용하기 위해서는 Dog, Cat, Animal 모두를 포함할 수 있는 Animal 을 반환타입으로 지정하게 된다.
     * 따라서 Dog 로 반환 받을 수 없다.
     * 결국 클라이언트에서 캐스팅을 해줘야 하는 번거로움이 발생한다.
     *
     * Ex.
     * Box<Dog> dogBox = new Box<>();
     * Dog dog = (Dog) WildcardEx.printAndReturnWildcard(dogBox);
     */
    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    /**
     * 하한 와일드 카드
     * <? super Animal> : 하한을 Animal로 제한
     * ?에 들어올 수 있는 타입은 Animal 보다 상위 객체여야 한다.
     * 즉, 하한이 Animal. 여기서는 Animal, Object 둘만 가능.
     *
     * super는 와일드 카드에서만 사용할 수 있는 특별한 기능이다.
     * 제네릭 타입이나 제네릭 메서드에서는 사용할 수 없다.
     */
    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍이", 100));
    }
}
