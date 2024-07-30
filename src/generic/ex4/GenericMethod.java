package generic.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj){
        System.out.println("Object print : " + obj);
        return obj;
    }

    /**
     * static 메서드에서는 제네릭 타입의 타입 매개변수를 사용할 수 없다.
     * 제네릭 클래스의 타입은 인스턴스가 생성되는 시점에 정해진다.
     * 그런데 static 메서드는 인스턴스와 무관하기 때문에 제네릭 클래스의 타입을 사용할 수 없다.
     * (인스턴스 단위가 아닌 클래스 단위이기 때문에 라고 표현했음.
     *  인스턴스 소속이 아니고 메서드 영역에 있는 클래스 소속이다 라고도 표현했음)
     *
     * 따라서 static 메서드에서 제네릭을 사용하려면 제네릭 메서드를 사용해야 한다.
     * public static T genericMethod(T t){} 이렇게 사용할 수 없다는 말.
     */
    public static <T> T genericMethod(T t){
        System.out.println("Generic print : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("Number print : " + t);
        return t;
    }
}
